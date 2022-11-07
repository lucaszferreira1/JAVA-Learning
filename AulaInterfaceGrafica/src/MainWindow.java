import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.FillLayout;



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
		
		Button btnLimpar = new Button(shell, SWT.NONE);
		btnLimpar.setBounds(80, 275, 75, 25);
		btnLimpar.setText("Limpar");
		btnLimpar.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
			switch(e.type) {	
				case SWT.Selection:
						txtDigiteUmValor.setText("");
						break;
				}
			}
		});
		
		txtDigiteUmValor = new Text(shell, SWT.BORDER);
		txtDigiteUmValor.setToolTipText("Digite um valor");
		txtDigiteUmValor.setBounds(40, 181, 160, 21);
		
		btnAdicionar = new Button(shell, SWT.NONE);
		btnAdicionar.setText("Adicionar");
		btnAdicionar.setBounds(80, 226, 75, 25);
		btnAdicionar.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
			switch(e.type) {	
				case SWT.Selection:
						System.out.println(txtDigiteUmValor.getText());
						break;
				}
			}
		});
		
		List list = new List(shell, SWT.BORDER);
		list.setBounds(281, 161, 160, 195);
		
		Button btnAdicionar_1 = new Button(shell, SWT.NONE);
		btnAdicionar_1.setText("Fibonacci");
		btnAdicionar_1.setBounds(529, 194, 75, 25);
		
		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.setText("Primos");
		btnNewButton_1.setBounds(529, 226, 75, 25);
		
		table = new Table(shell, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(40, 35, 603, 45);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn tblclmnNewColumn = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn.setWidth(65);
		tblclmnNewColumn.setText("Sorteado");
		
		TableColumn tblclmnNewColumn_1 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_1.setWidth(71);
		tblclmnNewColumn_1.setText("Somatorio");
		
		TableColumn tblclmnNewColumn_2 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_2.setWidth(108);
		tblclmnNewColumn_2.setText("Média Aritmética");
		
		TableColumn tblclmnNewColumn_3 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_3.setWidth(108);
		tblclmnNewColumn_3.setText("Média Geométrica");
		
		TableColumn tblclmnNewColumn_4 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_4.setWidth(65);
		tblclmnNewColumn_4.setText("Variância");
		
		TableColumn tblclmnNewColumn_5 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_5.setWidth(86);
		tblclmnNewColumn_5.setText("Desvio Padrão");
		
		TableColumn tblclmnNewColumn_6 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_6.setWidth(85);
		tblclmnNewColumn_6.setText("Amplitude");
		
		Button btnAdicionar_1_1 = new Button(shell, SWT.NONE);
		btnAdicionar_1_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnAdicionar_1_1.setText("Fatorial");
		btnAdicionar_1_1.setBounds(529, 257, 75, 25);

	}
}
