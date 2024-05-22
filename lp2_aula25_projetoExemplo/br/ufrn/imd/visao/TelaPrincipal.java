package br.ufrn.imd.visao;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import br.ufrn.imd.dao.ClienteDao;
import br.ufrn.imd.dao.FornecedorDao;
import br.ufrn.imd.dao.ProdutoDao;

public class TelaPrincipal extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	private static ClienteDao cDao;
	private static FornecedorDao fDao;
	private static ProdutoDao pDao;

	JDesktopPane dtp = new JDesktopPane();
	
	JMenuBar mnbar = new JMenuBar();	
	JMenu menuCada = new JMenu("Cadastros");
	JMenu menuRela = new JMenu("Relatórios");
	JMenu menuAjud = new JMenu("Ajuda");
	
	JMenuItem mItCliente = new JMenuItem("Clientes");
	JMenuItem mItFornecedor = new JMenuItem("Fornecedores");
	JMenuItem mItProduto = new JMenuItem("Produtos");
	
	JMenuItem mItListagemCliente = new JMenuItem("Lista Clientes");
	JMenuItem mItListagemFornecedor = new JMenuItem("Lista Fornecedores");
	JMenuItem mItListagemProduto = new JMenuItem("Lista Produtos");
	
	JMenuItem mItem7 = new JMenuItem("Sobre");
	JMenuItem mItem8 = new JMenuItem("Sair");
		 		
	public TelaPrincipal(){
		Container ct = this.getContentPane();
		ct.setLayout(new BorderLayout());
		
		setJMenuBar(mnbar);
		mnbar.add(menuCada);
		mnbar.add(menuRela);
		mnbar.add(menuAjud);

		menuCada.add(mItCliente);
		menuCada.add(mItFornecedor);
		menuCada.add(mItProduto);
		
		menuRela.add(mItListagemCliente);
		menuRela.add(mItListagemFornecedor);
		menuRela.add(mItListagemProduto);
		
		menuAjud.add(mItem7);
		menuAjud.addSeparator();
		menuAjud.add(mItem8);
		
		ct.add(BorderLayout.CENTER, dtp);
		
		setSize(900,700);
		setResizable(false);
		setTitle("Sistema de Controle de Vendas");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// eventos
		mItCliente.addActionListener(this);	
		mItFornecedor.addActionListener(this);
		mItProduto.addActionListener(this);
		
		mItListagemCliente.addActionListener(this);
		mItListagemFornecedor.addActionListener(this);
		mItListagemProduto.addActionListener(this);
		
		mItem8.addActionListener(this);
		
		//bc = new Repositorio();
		cDao = ClienteDao.getInstance();
		fDao = FornecedorDao.getInstance();
		pDao = ProdutoDao.getInstance();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mItCliente){
			
			try {
				System.out.println("Esperando .....");
				Thread.sleep(500);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			System.out.println("Pronto .....");
			
			TelaCliente tlCliente = new TelaCliente("Clientes");
			dtp.add(tlCliente);
			tlCliente.setVisible(true);
		}
		if (e.getSource() == mItFornecedor){
			TelaFornecedor tlFornecedor = new TelaFornecedor("Fornecedores");
			dtp.add(tlFornecedor);
			tlFornecedor.setVisible(true);
		}
		if (e.getSource() == mItProduto){
			TelaProduto tlProduto = new TelaProduto("Produtos");
			dtp.add(tlProduto);
			tlProduto.setVisible(true);
		}
		if (e.getSource() == mItListagemCliente) {
			cDao = ClienteDao.getInstance();
			cDao.listarClientes();
		}
		if (e.getSource() == mItListagemFornecedor) {
			fDao = FornecedorDao.getInstance();
			fDao.listarFornecedores();
		}
		if (e.getSource() == mItListagemProduto) {
			pDao = ProdutoDao.getInstance();
			pDao.listarProdutos();
		}
		if (e.getSource() == mItem8) {
			System.out.println("Fechando o sistema!!!");
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		TelaPrincipal telaPai = new TelaPrincipal();
		telaPai.setVisible(true);
	}
}
