import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class GirisEkrani extends JFrame {
	
	AlanGrafigi obj1 = new AlanGrafigi();
	CizgiGrafigi obj2 = new CizgiGrafigi();
	CubukGrafigi obj3 = new CubukGrafigi();
	IkiSeriliCizgiGrafigi obj4 = new IkiSeriliCizgiGrafigi();
	PastaGrafigi obj = new PastaGrafigi();

	private JPanel contentPane;
	private JTextField txtGrafikUygulamasnaHogeldiniz;
	private JTextField txtAadaBulunanKonularn;
	private JTextField txtKaradenizVeI;
	private JTextField txtlkemizdeBlgelereGre;
	private JTextField txtSonYln;
	private JTextField txtAyeVeAhmetin;
	private JTextField txtlkemizdeEnok;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GirisEkrani frame = new GirisEkrani();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public GirisEkrani() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 851, 627);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtGrafikUygulamasnaHogeldiniz = new JTextField();
		txtGrafikUygulamasnaHogeldiniz.setForeground(Color.RED);
		txtGrafikUygulamasnaHogeldiniz.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		txtGrafikUygulamasnaHogeldiniz.setText(" GRAF\u0130K UYGULAMASINA HO\u015EGELD\u0130N\u0130Z ");
		txtGrafikUygulamasnaHogeldiniz.setBounds(225, 23, 375, 30);
		contentPane.add(txtGrafikUygulamasnaHogeldiniz);
		txtGrafikUygulamasnaHogeldiniz.setColumns(10);
		
		txtAadaBulunanKonularn = new JTextField();
		txtAadaBulunanKonularn.setForeground(new Color(0, 0, 0));
		txtAadaBulunanKonularn.setFont(new Font("Arial", Font.BOLD, 12));
		txtAadaBulunanKonularn.setText("  A\u015Fa\u011F\u0131da bulunan konular\u0131n grafiklerini g\u00F6rmek i\u00E7in l\u00FCtfen konunun sol taraf\u0131nda bulunan grafik butonuna t\u0131klay\u0131n\u0131z !");
		txtAadaBulunanKonularn.setBounds(78, 76, 657, 30);
		contentPane.add(txtAadaBulunanKonularn);
		txtAadaBulunanKonularn.setColumns(10);
		
		txtKaradenizVeI = new JTextField();
		txtKaradenizVeI.setForeground(Color.BLACK);
		txtKaradenizVeI.setFont(new Font("Arial", Font.BOLD, 12));
		txtKaradenizVeI.setText("      Karadeniz ve \u0130\u00E7 Anadolu B\u00F6lgesi Son 4 Y\u0131l Ya\u011F\u0131\u015F Miktar\u0131");
		txtKaradenizVeI.setBounds(394, 159, 421, 30);
		contentPane.add(txtKaradenizVeI);
		txtKaradenizVeI.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("\u00C7UBUK GRAF\u0130\u011E\u0130\r\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj3.start();
			}
		});
		btnNewButton_1.setForeground(new Color(0, 0, 139));
		btnNewButton_1.setFont(new Font("Verdana", Font.BOLD, 18));
		btnNewButton_1.setBounds(30, 222, 320, 39);
		contentPane.add(btnNewButton_1);
		
		txtlkemizdeBlgelereGre = new JTextField();
		txtlkemizdeBlgelereGre.setFont(new Font("Arial", Font.BOLD, 12));
		txtlkemizdeBlgelereGre.setText("      \u00DClkemizde B\u00F6lgelere G\u00F6re Kad\u0131n Cinayetleri Say\u0131s\u0131");
		txtlkemizdeBlgelereGre.setBounds(394, 230, 421, 31);
		contentPane.add(txtlkemizdeBlgelereGre);
		txtlkemizdeBlgelereGre.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("\u00C7\u0130ZG\u0130 GRAF\u0130\u011E\u0130\r\n");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj2.start();
			}
		});
		btnNewButton_2.setForeground(new Color(0, 0, 139));
		btnNewButton_2.setFont(new Font("Verdana", Font.BOLD, 18));
		btnNewButton_2.setBounds(30, 294, 320, 39);
		contentPane.add(btnNewButton_2);
		
		txtSonYln = new JTextField();
		txtSonYln.setText("      Son 10 Y\u0131l\u0131n \u0130\u015Fsizlik Oranlar\u0131");
		txtSonYln.setFont(new Font("Arial", Font.BOLD, 12));
		txtSonYln.setBounds(394, 302, 421, 30);
		contentPane.add(txtSonYln);
		txtSonYln.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("\u0130K\u0130 SER\u0130L\u0130 \u00C7\u0130ZG\u0130 GRAF\u0130\u011E\u0130\r\n");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj4.start();
			}
		});
		btnNewButton_3.setForeground(new Color(0, 0, 139));
		btnNewButton_3.setFont(new Font("Verdana", Font.BOLD, 18));
		btnNewButton_3.setBounds(31, 367, 320, 39);
		contentPane.add(btnNewButton_3);
		
		txtAyeVeAhmetin = new JTextField();
		txtAyeVeAhmetin.setText("      Ay\u015Fe ve Ahmet'in Son 10 Denemedeki Net Say\u0131lar\u0131");
		txtAyeVeAhmetin.setFont(new Font("Arial", Font.BOLD, 12));
		txtAyeVeAhmetin.setBounds(394, 376, 421, 30);
		contentPane.add(txtAyeVeAhmetin);
		txtAyeVeAhmetin.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("PASTA GRAF\u0130\u011E\u0130");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.start();
			}
		});
		btnNewButton_4.setForeground(new Color(0, 0, 139));
		btnNewButton_4.setFont(new Font("Verdana", Font.BOLD, 18));
		btnNewButton_4.setBounds(30, 435, 320, 39);
		contentPane.add(btnNewButton_4);
		
		txtlkemizdeEnok = new JTextField();
		txtlkemizdeEnok.setFont(new Font("Arial", Font.BOLD, 12));
		txtlkemizdeEnok.setText("      \u00DClkemizde En \u00C7ok Kullan\u0131lan Sosyal Medya Uygulamalar\u0131 ve Oranlar\u0131");
		txtlkemizdeEnok.setBounds(394, 444, 421, 30);
		contentPane.add(txtlkemizdeEnok);
		txtlkemizdeEnok.setColumns(10);
		
		JButton btnNewButton = new JButton("ALAN GRAF\u0130\u011E\u0130");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj1.start();
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 139));
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 18));
		btnNewButton.setBounds(30, 157, 320, 39);
		contentPane.add(btnNewButton);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
