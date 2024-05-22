package br.ufrn.imd.visao;


import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import br.ufrn.imd.dao.ClienteDao;
import br.ufrn.imd.modelo.Cliente;

public class TelaCliente extends JInternalFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	int cod = 0;

	private static ClienteDao cDao;
	
	// Format as datas
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	
	// rótulos
	JLabel lnome   = new JLabel("Nome......:");
	JLabel ldtNasc = new JLabel("Data Nasc.:");
	JLabel lcpf    = new JLabel("CPF.......:");
	
	private Font f	= new Font("Courier", Font.PLAIN, 12);
			
	// campos
	JTextField tnome   = new JTextField();
	//JTextField tdtnasc = new JTextField();
	JTextField tcpf    = new JTextField();
	JFormattedTextField tdtnasc = new JFormattedTextField(Mascara("##/##/####"));
			
	// botões
	JButton btSubmeter = new JButton("Submeter");
	JButton btLimpar = new JButton("Limpar");

	public TelaCliente(String str)  {
		super(str,false,true);
		
		Container ct = this.getContentPane();
		ct.setLayout(null);
		
		// setando a fonte
		lnome.setFont(f);
		ldtNasc.setFont(f);
		lcpf.setFont(f);
			
		// coordenadas
		lnome.setBounds(10,10,100,30);
		tnome.setBounds(92,10,280,25);
		ldtNasc.setBounds(10,40,100,30);
		tdtnasc.setBounds(92,40,65,25);
		lcpf.setBounds(10,70,100,30);
		tcpf.setBounds(92,70,100,25);

		// idem
		btSubmeter.setBounds(50,140,100,30);
		btLimpar.setBounds(230,140,100,30);
				
		// adicionando componentes
		ct.add(lnome);
		ct.add(tnome);
		ct.add(ldtNasc);
		ct.add(tdtnasc);
		ct.add(lcpf);
		ct.add(tcpf);
		ct.add(btSubmeter);
		ct.add(btLimpar);
		
		// evento dos botões
		btSubmeter.addActionListener(this);		
		btLimpar.addActionListener(this);
		
		// especificações do formulário
		setSize(390,210);
		setTitle(str);
		
		cDao = ClienteDao.getInstance();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btSubmeter){
			
			// buscando último cliente
			//cod = bc.buscaCodigoCliente();
			cod = cDao.buscaCodigoCliente();
			cod++;
			
			// setar atributos Cliente
			Cliente c = new Cliente();
			c.setIdCliente(cod);
			
			c.setNomeCliente(tnome.getText());
			c.setCpf(tcpf.getText());
			
			// formatar a data do campo de texto
			try {
				c.setDataNascimento(formato.parse(tdtnasc.getText()));
			} catch (ParseException pe) {
				pe.printStackTrace();
			}
			
			// persistir dados
			//bc.inserirCliente(c);
			cDao.inserirCliente(c);
			JOptionPane.showMessageDialog(null, "Cliente " + c.getNomeCliente() + " incluído!");
			
			tnome.setText("");
			tdtnasc.setText("");
			tcpf.setText("");
			
			tnome.requestFocus();
		}
		else if(e.getSource() == btLimpar){
			tnome.setText("");
			tdtnasc.setText("");
			tcpf.setText("");
		}
	}
	
	public MaskFormatter Mascara(String Mascara){
        
        MaskFormatter formatoData = new MaskFormatter();
        try{
        	formatoData.setMask(Mascara); //Atribui a mascara
        	formatoData.setPlaceholderCharacter(' '); //Caracter para preencimento 
        }
        catch (Exception excecao) {
        excecao.printStackTrace();
        } 
        return formatoData;
	}
	
}
