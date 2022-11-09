import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.FillLayout;

import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class MainWindow {

	protected Shell shell;
	private Text txtDigiteUmValor;
	private Button btnAdicionar;
	private Table table;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainWindow window = new MainWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(723, 458);
		shell.setText("SWT Application");
		shell.setLayout(null);
		
		List list = new List(shell, SWT.BORDER);
		list.setBounds(281, 161, 160, 195);
		
		table = new Table(shell, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(40, 35, 603, 45);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn clmnSort = new TableColumn(table, SWT.NONE);
		clmnSort.setWidth(65);
		clmnSort.setText("Sorteado");
		
		TableColumn clmnSum = new TableColumn(table, SWT.NONE);
		clmnSum.setWidth(71);
		clmnSum.setText("Somatorio");
		
		TableColumn clmnArith = new TableColumn(table, SWT.NONE);
		clmnArith.setWidth(108);
		clmnArith.setText("Média Aritmética");
		
		TableColumn clmnGeom = new TableColumn(table, SWT.NONE);
		clmnGeom.setWidth(108);
		clmnGeom.setText("Média Geométrica");
		
		TableColumn clmnVari = new TableColumn(table, SWT.NONE);
		clmnVari.setWidth(65);
		clmnVari.setText("Variância");
		
		TableColumn clmnDePa = new TableColumn(table, SWT.NONE);
		clmnDePa.setWidth(86);
		clmnDePa.setText("Desvio Padrão");
		
		TableColumn clmnAmp = new TableColumn(table, SWT.NONE);
		clmnAmp.setWidth(85);
		clmnAmp.setText("Amplitude");
		
		Text txtDigiteUmValor = new Text(shell, SWT.BORDER);
		txtDigiteUmValor.setToolTipText("Digite um valor");
		txtDigiteUmValor.setBounds(40, 181, 160, 21);
		
		Button btnAdicionar = new Button(shell, SWT.NONE);
		btnAdicionar.setText("Adicionar");
		btnAdicionar.setBounds(80, 226, 75, 25);
		btnAdicionar.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
			switch(e.type) {	
				case SWT.Selection:
						int input = Integer.parseInt(txtDigiteUmValor.getText());
						break;
				}
			}
		});
		
		Button btnLimpar = new Button(shell, SWT.NONE);
		btnLimpar.setBounds(80, 275, 75, 25);
		btnLimpar.setText("Limpar");
		btnLimpar.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
			switch(e.type) {	
				case SWT.Selection:
						txtDigiteUmValor.setText("");
						limpar(list);
						break;
				}
			}
		});
		
		Button btnFibon = new Button(shell, SWT.NONE);
		btnFibon.setText("Fibonacci");
		btnFibon.setBounds(529, 194, 75, 25);
		btnFibon.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent ev) {
				int input = Integer.parseInt(txtDigiteUmValor.getText());
				Fibonacci fib =  new Fibonacci();
				fib.gerar(input);
				java.util.List<Integer> sequencia = fib.getSequencia();
				adicionaValor(sequencia, list);
			}
		});
		
		Button btnPrime = new Button(shell, SWT.NONE);
		btnPrime.setText("Primos");
		btnPrime.setBounds(529, 226, 75, 25);
		btnPrime.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent ev) {
				int input = Integer.parseInt(txtDigiteUmValor.getText());
				NumeroPrimos pri =  new NumeroPrimos();
				pri.gerar(input);
				java.util.List<Integer> sequencia = pri.getSequencia();
				adicionaValor(sequencia, list);
			}
		});
		
		Button btnFat = new Button(shell, SWT.NONE);
		btnFat.setText("Fatorial");
		btnFat.setBounds(529, 257, 75, 25);
		btnFat.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent ev) {
				try {
					int input = Integer.parseInt(txtDigiteUmValor.getText());
					Fatoriais fat =  new Fatoriais();
					fat.gerar(input);
					java.util.List<Integer> sequencia = fat.getSequencia();
					adicionaValor(sequencia, list);
					generateParams(fat, table);
				}catch(Exception e) {
					System.err.println("Erro ao tentar gerar a lista!");
				}
				
			}
		});

	}
	
	private void adicionaValor(java.util.List<Integer> values, List lista) {
		lista.removeAll();
		for (Integer i : values){
			lista.add(i.toString());
		}
	}
	
	private void limpar(List lista) {
		lista.removeAll();
	}
	
	private void generateParams(Object o, Table table) {
		try {
			
		}catch(Exception e) {
			System.err.print("Erro ao tentar listar seus atributos");
		}
	}
}
