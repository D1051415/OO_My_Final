import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class Fexam_D1051415_2 extends JPanel implements ActionListener {
	private JFrame FirBoard = new JFrame(" Tic Tac Toe");

	// private int[][] test1 = { { -1, -1, -1 }, { -1, -1, -1 }, { -1, -1, -1 } };
	// private int[][] test2 = { { -1, -1, -1, -1 }, { -1, -1, -1, -1 }, { -1, -1,
	// -1, -1 }, { -1, -1, -1, -1 } };
	// private int[][] test3 = { { -1, -1, -1, -1, -1 }, { -1, -1, -1, -1, -1 }, {
	// -1, -1, -1, -1, -1 },
	// { -1, -1, -1, -1, -1 }, { -1, -1, -1, -1, -1 } };
	// private int[][] test4 = { { -1, -1, -1, -1, -1, -1 }, { -1, -1, -1, -1, -1,
	// -1 }, { -1, -1, -1, -1, -1, -1 },
	// { -1, -1, -1, -1, -1, -1 }, { -1, -1, -1, -1, -1, -1 }, { -1, -1, -1, -1, -1,
	// -1 } };
	// private int[][] test5 = { { -1, -1, -1, -1, -1, -1, -1 }, { -1, -1, -1, -1,
	// -1, -1, -1 },
	// { -1, -1, -1, -1, -1, -1, -1 }, { -1, -1, -1, -1, -1, -1, -1 }, { -1, -1, -1,
	// -1, -1, -1, -1 },
	// { -1, -1, -1, -1, -1, -1, -1 }, { -1, -1, -1, -1, -1, -1, -1 } };
	private int[][] test6 = { { -1, -1, -1, -1, -1, -1, -1, -1 }, { -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1 }, { -1, -1, -1, -1, -1, -1, -1, -1 }, { -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1 }, { -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1 }};

	private int x, y;
	private int count = 0;

	// 1
	private JPanel size = new JPanel(new GridLayout(1, 6, 2, 2));
	private JPanel length = new JPanel(new GridLayout(1, 3, 2, 2));
	private JPanel display = new JPanel(new GridLayout(5, 1, 2, 2));
	private JPanel fir = new JPanel(new GridLayout(1, 2, 2, 2));
	private JPanel sec = new JPanel(new GridLayout(1, 2, 2, 2));
	private JPanel thi = new JPanel(new GridLayout(1, 2, 2, 2));
	private JPanel fou = new JPanel(new GridLayout(1, 2, 2, 2));
	private JPanel fif = new JPanel(new GridLayout(1, 2, 2, 2));
	// 2
	private JPanel pan = new JPanel();
	private JPanel option = new JPanel(new GridLayout(1, 2, 2, 2));
	private JRadioButton rb1 = new JRadioButton("3"), rb2 = new JRadioButton("4"), rb3 = new JRadioButton("5"),
			rb4 = new JRadioButton("6"), rb5 = new JRadioButton("7"), rb6 = new JRadioButton("8"),
			rb7 = new JRadioButton("3"), rb8 = new JRadioButton("4"), rb9 = new JRadioButton("5");
	private ButtonGroup g1 = new ButtonGroup();
	private ButtonGroup g2 = new ButtonGroup();

	private JLabel jlb1 = new JLabel("Board Size", JLabel.CENTER);
	private JLabel jlb2 = new JLabel("Winning Length", JLabel.CENTER);
	private JLabel jlb3 = new JLabel("O Player", JLabel.CENTER);
	private JLabel jlb4 = new JLabel("X Player", JLabel.CENTER);

	private JComboBox<String> list1 = new JComboBox<String>();
	private JComboBox<String> list2 = new JComboBox<String>();

	public JButton yes = new JButton("√");
	public JButton no = new JButton("X");
	public JButton opt = new JButton("Option");
	public JButton res = new JButton("Reset");
	JButton[][] bt = new JButton[3][3];

	private Boolean oxfg = true;

	public static void main(String[] args) {
		Fexam_D1051415_2 apFinal = new Fexam_D1051415_2();
		apFinal.setVisible(true);
	}

	public Fexam_D1051415_2() {
		init();
	}

	void init() {
		jlb1.setOpaque(true);
		jlb1.setBackground(new Color(75, 92, 116));
		jlb1.setForeground(new Color(188, 194, 212));
		fir.add(jlb1);
		g1.add(rb1);
		g1.add(rb2);
		g1.add(rb3);
		g1.add(rb4);
		g1.add(rb5);
		g1.add(rb6);
		rb1.setActionCommand("3");
		rb2.setActionCommand("4");
		rb3.setActionCommand("5");
		rb4.setActionCommand("6");
		rb5.setActionCommand("7");
		rb6.setActionCommand("8");
		size.add(rb1);
		size.add(rb2);
		size.add(rb3);
		size.add(rb4);
		size.add(rb5);
		size.add(rb6);
		rb1.addActionListener(this);
		rb2.addActionListener(this);
		rb3.addActionListener(this);
		rb4.addActionListener(this);
		rb5.addActionListener(this);
		rb6.addActionListener(this);
		fir.add(size);

		jlb2.setOpaque(true);
		jlb2.setBackground(new Color(75, 92, 116));
		jlb2.setForeground(new Color(188, 194, 212));
		sec.add(jlb2);
		g2.add(rb7);
		g2.add(rb8);
		g2.add(rb9);
		rb7.setActionCommand("3");
		rb8.setActionCommand("4");
		rb9.setActionCommand("5");
		length.add(rb7);
		length.add(rb8);
		length.add(rb9);
		rb7.addActionListener(this);
		rb8.addActionListener(this);
		rb9.addActionListener(this);
		sec.add(length);

		jlb3.setOpaque(true);
		jlb3.setBackground(new Color(75, 92, 116));
		jlb3.setForeground(new Color(188, 194, 212));
		thi.add(jlb3);
		list1.addItem("Human");
		thi.add(list1);

		jlb4.setOpaque(true);
		jlb4.setBackground(new Color(75, 92, 116));
		jlb4.setForeground(new Color(188, 194, 212));
		fou.add(jlb4);
		list2.addItem("Human");
		list2.addItem("Computer");
		fou.add(list2);

		yes.addActionListener(this);
		yes.setBackground(new Color(188, 194, 212));
		yes.setForeground(Color.BLACK);
		yes.setFont(new Font("標楷體", Font.BOLD, 36));
		yes.setFocusPainted(false);
		no.addActionListener(this);
		no.setBackground(new Color(188, 194, 212));
		no.setForeground(Color.BLACK);
		no.setFont(new Font("標楷體", Font.BOLD, 36));
		no.setFocusPainted(false);
		fif.add(yes);
		fif.add(no);

		display.setBackground(new Color(188, 194, 212));
		display.setForeground(new Color(224, 255, 255));
		display.add(thi);
		display.add(fou);
		display.add(fir);
		display.add(sec);
		display.add(fif);

		opt.addActionListener(this);
		opt.setBackground(new Color(188, 194, 212));
		opt.setForeground(Color.BLACK);
		opt.setFont(new Font("", Font.BOLD, 24));
		opt.setFocusPainted(false);
		res.addActionListener(this);
		res.setBackground(new Color(188, 194, 212));
		res.setForeground(Color.BLACK);
		res.setFont(new Font("", Font.BOLD, 24));
		res.setFocusPainted(false);
		option.add(opt);
		option.add(res);

		FirBoard.add(display);
		FirBoard.setSize(600, 700);
		FirBoard.setLocationRelativeTo(null);
		FirBoard.setResizable(false);
		FirBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FirBoard.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == yes) {

			if (g1.getSelection() == null || g2.getSelection() == null) {
				JOptionPane.showMessageDialog(FirBoard, "此條件遊戲無法執行!", "警告", JOptionPane.ERROR_MESSAGE);
			}

			else if (g1.getSelection().getActionCommand() == "3" && g2.getSelection().getActionCommand() == "3") {
				pan = new JPanel((new GridLayout(3, 3, 3, 3)));
				// for (int i = 0; i < 3; i++) {
				// for (int j = 0; j < 3; j++) {
				// bt[i][j] = new JButton("");
				// pan.add(bt[i][j]);
				// }
				// }
				if (list2.getSelectedItem() == "Human") {
					PPBoard(3, 3);
				} else {
					CBoard(3, 3);
				}
				display.setVisible(false);
				FirBoard.add(pan);
				FirBoard.add(option, BorderLayout.PAGE_END);
			}

			else if (g1.getSelection().getActionCommand() == "4") {
				pan = new JPanel((new GridLayout(4, 4, 3, 3)));
				if (g2.getSelection().getActionCommand() == "3") {
					if (list2.getSelectedItem() == "Human") {
						PPBoard(4, 3);
					} else {
						CBoard(4, 3);
					}
					display.setVisible(false);
					FirBoard.add(pan);
					FirBoard.add(option, BorderLayout.PAGE_END);
				} else if (g2.getSelection().getActionCommand() == "4") {
					if (list2.getSelectedItem() == "Human") {
						PPBoard(4, 4);
					} else {
						CBoard(4, 4);
					}
					display.setVisible(false);
					FirBoard.add(pan);
					FirBoard.add(option, BorderLayout.PAGE_END);

				} else {
					JOptionPane.showMessageDialog(FirBoard, "此條件遊戲無法執行!", "警告", JOptionPane.ERROR_MESSAGE);
				}
			}

			else if (g1.getSelection().getActionCommand() == "5") {
				pan = new JPanel((new GridLayout(5, 5, 3, 3)));
				if (g2.getSelection().getActionCommand() == "3") {
					if (list2.getSelectedItem() == "Human") {
						PPBoard(5, 3);
					} else {
						CBoard(5, 3);
					}
					display.setVisible(false);
					FirBoard.add(pan);
					FirBoard.add(option, BorderLayout.PAGE_END);

				} else if (g2.getSelection().getActionCommand() == "4") {
					if (list2.getSelectedItem() == "Human") {
						PPBoard(5, 4);
					} else {
						CBoard(5, 4);
					}
					display.setVisible(false);
					FirBoard.add(pan);
					FirBoard.add(option, BorderLayout.PAGE_END);

				} else if (g2.getSelection().getActionCommand() == "5") {
					if (list2.getSelectedItem() == "Human") {
						PPBoard(5, 5);
					} else {
						CBoard(5, 5);
					}
					display.setVisible(false);
					FirBoard.add(pan);
					FirBoard.add(option, BorderLayout.PAGE_END);

				}
			}

			else if (g1.getSelection().getActionCommand() == "6") {
				pan = new JPanel((new GridLayout(6, 6, 3, 3)));
				if (g2.getSelection().getActionCommand() == "3") {
					if (list2.getSelectedItem() == "Human") {
						PPBoard(6, 3);
					} else {
						CBoard(6, 3);
					}
					display.setVisible(false);
					FirBoard.add(pan);
					FirBoard.add(option, BorderLayout.PAGE_END);

				} else if (g2.getSelection().getActionCommand() == "4") {
					if (list2.getSelectedItem() == "Human") {
						PPBoard(6, 4);
					} else {
						CBoard(6, 4);
					}
					display.setVisible(false);
					FirBoard.add(pan);
					FirBoard.add(option, BorderLayout.PAGE_END);

				} else if (g2.getSelection().getActionCommand() == "5") {
					if (list2.getSelectedItem() == "Human") {
						PPBoard(6, 5);
					} else {
						CBoard(6, 5);
					}
					display.setVisible(false);
					FirBoard.add(pan);
					FirBoard.add(option, BorderLayout.PAGE_END);

				}
			}

			else if (g1.getSelection().getActionCommand() == "7") {
				pan = new JPanel((new GridLayout(7, 7, 3, 3)));
				if (g2.getSelection().getActionCommand() == "3") {
					if (list2.getSelectedItem() == "Human") {
						PPBoard(7, 3);
					} else {
						CBoard(7, 3);
					}
					display.setVisible(false);
					FirBoard.add(pan);
					FirBoard.add(option, BorderLayout.PAGE_END);

				} else if (g2.getSelection().getActionCommand() == "4") {
					if (list2.getSelectedItem() == "Human") {
						PPBoard(7, 4);
					} else {
						CBoard(7, 4);
					}
					display.setVisible(false);
					FirBoard.add(pan);
					FirBoard.add(option, BorderLayout.PAGE_END);

				} else if (g2.getSelection().getActionCommand() == "5") {
					if (list2.getSelectedItem() == "Human") {
						PPBoard(7, 5);
					} else {
						CBoard(7, 5);
					}
					display.setVisible(false);
					FirBoard.add(pan);
					FirBoard.add(option, BorderLayout.PAGE_END);

				}
			}

			else if (g1.getSelection().getActionCommand() == "8") {
				pan = new JPanel((new GridLayout(8, 8, 3, 3)));
				if (g2.getSelection().getActionCommand() == "3") {
					if (list2.getSelectedItem() == "Human") {
						PPBoard(8, 3);
					} else {
						CBoard(8, 3);
					}
					display.setVisible(false);
					FirBoard.add(pan);
					FirBoard.add(option, BorderLayout.PAGE_END);

				} else if (g2.getSelection().getActionCommand() == "4") {
					if (list2.getSelectedItem() == "Human") {
						PPBoard(8, 4);
					} else {
						CBoard(8, 4);
					}
					display.setVisible(false);
					FirBoard.add(pan);
					FirBoard.add(option, BorderLayout.PAGE_END);

				} else if (g2.getSelection().getActionCommand() == "5") {
					if (list2.getSelectedItem() == "Human") {
						PPBoard(8, 5);
					} else {
						CBoard(8, 5);
					}
					display.setVisible(false);
					FirBoard.add(pan);
					FirBoard.add(option, BorderLayout.PAGE_END);

				}
			}

			else {
				JOptionPane.showMessageDialog(FirBoard, "此條件遊戲無法執行!", "警告", JOptionPane.ERROR_MESSAGE);
			}
		}

		if (ae.getSource() == no) {
			System.exit(0);
		}

		if (ae.getSource() == opt) {
			pan.setVisible(false);
			display.setVisible(true);
		}

		if (ae.getSource() == res) {
			reset();
		}
	}

	private void CBoard(int a, int b) {
		pan = new JPanel((new GridLayout(a, a, 3, 3)));
		bt = new JButton[a][a];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				int x1 = i;
				int y1 = j;
				bt[i][j] = new JButton("");
				pan.add(bt[i][j]);
				bt[i][j].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						JButton tmpBtn = (JButton) ae.getSource();
						if (tmpBtn.getText().equals("")) {
							tmpBtn.setText("O");
							test6[x1][y1] = 0;
							count++;
							ran(a);
							count++;
							check_win_lose(x1, y1, a, b);
						}
					}
				});
			}
		}
	}

	private void ran(int a) {
		x = (int) (Math.random() * a) + 0;
		y = (int) (Math.random() * a) + 0;
		if (bt[x][y].getText().equals("")) {
			bt[x][y].setText("X");
			test6[x][y] = 1;
		} else {
			while (count < a * a) {
				x = (int) (Math.random() * a) + 0;
				y = (int) (Math.random() * a) + 0;
				if (test6[x][y] == -1) {
					break;
				}
			}
			if (bt[x][y].getText().equals("")) {
				bt[x][y].setText("X");
				test6[x][y] = 1;
			}
		}
	}

	private void PPBoard(int a, int b) {
		pan = new JPanel((new GridLayout(a, a, 3, 3)));
		bt = new JButton[a][a];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				int x1 = i;
				int y1 = j;
				bt[i][j] = new JButton("");
				pan.add(bt[i][j]);
				bt[i][j].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						JButton tmpBtn = (JButton) ae.getSource();
						if (tmpBtn.getText().equals("")) {
							if (oxfg == true) {
								tmpBtn.setText("O");
								test6[x1][y1] = 0;
								oxfg = false;
							} else if (oxfg == false) {
								tmpBtn.setText("X");
								test6[x1][y1] = 1;
								oxfg = true;
							}
							// System.out.print(test6[x1][y1]);
							count++;
							check_win_lose(x1, y1, a, b);
						}

						// if (a == 3) {
						// check_win_lose_win_lose_draw3();
						// }
						// if (a == 4) {
						// if (b == 3) {
						// check_win_lose_win_lose_draw43();
						// }
						// if (b == 4) {
						// check_win_lose_win_lose_draw44();
						// }
						// }
						// if (a == 5) {
						// if (b == 3) {
						// check_win_lose_win_lose_draw53();
						// }
						// if (b == 4) {
						// check_win_lose_win_lose_draw54();
						// }
						// if (b == 5) {
						// check_win_lose_win_lose_draw55();
						// }
						// }
						// if (a == 6) {
						// if (b == 3) {
						// check_win_lose_win_lose_draw63();
						// }
						// if (b == 4) {
						// check_win_lose_win_lose_draw64();
						// }
						// if (b == 5) {
						// check_win_lose_win_lose_draw65();
						// }
						// }
						// if (a == 7) {
						// if (b == 3) {
						// check_win_lose_win_lose_draw73();
						// }
						// if (b == 4) {
						// check_win_lose_win_lose_draw74();
						// }
						// if (b == 5) {
						// check_win_lose_win_lose_draw75();
						// }
						// }
						// if (a == 8) {
						// if (b == 3) {
						// check_win_lose_win_lose_draw83();
						// }
						// if (b == 4) {
						// check_win_lose_win_lose_draw84();
						// }
						// if (b == 5) {
						// check_win_lose_win_lose_draw85();
						// }
						// }
					}
				});
			}
		}
	}

	private void reset() {
		for (int i = 0; i < Integer.parseInt(g1.getSelection().getActionCommand()); i++) {
			for (int j = 0; j < Integer.parseInt(g1.getSelection().getActionCommand()); j++) {
				bt[i][j].setText("");
				// test1[i][j] = -1;
				// test2[i][j] = -1;
				// test3[i][j] = -1;
				// test4[i][j] = -1;
				// test5[i][j] = -1;
				test6[i][j] = -1;
			}
		}
		count = 0;
		oxfg = true;
	}

	private void check_win_lose(int xi, int yi, int a, int len) {
		if (count < a * a) {
			if (len == 3) {
				for (int i = 0; i < a; i++) {
					if (test6[xi][i] == test6[xi][i + 1] && test6[xi][i] == test6[xi][i + 2]) {
						if (test6[xi][i] == 0) {
							JOptionPane.showMessageDialog(Fexam_D1051415_2.this, "Playier 1 win!!");
						} else if (test6[xi][i] == 1) {
							JOptionPane.showMessageDialog(Fexam_D1051415_2.this, "Playier 2 win!!");
						}
					} else if (test6[i][yi] == test6[i + 1][yi] && test6[i][yi] == test6[i + 2][yi]) {
						if (test6[i][yi] == 0) {
							JOptionPane.showMessageDialog(Fexam_D1051415_2.this, "Playier 1 win!!");
						} else if (test6[i][yi] == 1) {
							JOptionPane.showMessageDialog(Fexam_D1051415_2.this, "Playier 2 win!!");
						}
					} else if ((test6[xi][yi] == test6[xi + 1][yi + 1] && test6[xi][yi] == test6[xi + 2][yi + 2])) {
						if (test6[xi][yi] == 0) {
							JOptionPane.showMessageDialog(Fexam_D1051415_2.this, "Playier 1 win!!");
							break;
						} else if (test6[xi][yi] == 1) {
							JOptionPane.showMessageDialog(Fexam_D1051415_2.this, "Playier 2 win!!");
							break;
						}
					} else if (xi >= 1 && yi >= 1
							&& (test6[xi][yi] == test6[xi - 1][yi - 1] && test6[xi][yi] == test6[xi + 1][yi + 1])) {
						if (test6[xi][yi] == 0) {
							JOptionPane.showMessageDialog(Fexam_D1051415_2.this, "Playier 1 win!!");
							break;
						} else if (test6[xi][yi] == 1) {
							JOptionPane.showMessageDialog(Fexam_D1051415_2.this, "Playier 2 win!!");
							break;
						}
					} else if (xi >= 2 && yi >= 2
							&& (test6[xi][yi] == test6[xi - 1][yi - 1] && test6[xi][yi] == test6[xi - 2][yi - 2])) {
						if (test6[xi][yi] == 0) {
							JOptionPane.showMessageDialog(Fexam_D1051415_2.this, "Playier 1 win!!");
							break;
						} else if (test6[xi][yi] == 1) {
							JOptionPane.showMessageDialog(Fexam_D1051415_2.this, "Playier 2 win!!");
							break;
						}
					} else if (xi >= 2
							&& (test6[xi][yi] == test6[xi - 1][yi + 1] && test6[xi][yi] == test6[xi - 2][yi + 2])) {
						if (test6[xi][yi] == 0) {
							JOptionPane.showMessageDialog(Fexam_D1051415_2.this, "Playier 1 win!!");
							break;
						} else if (test6[xi][yi] == 1) {
							JOptionPane.showMessageDialog(Fexam_D1051415_2.this, "Playier 2 win!!");
							break;
						}
					} else if (xi >= 1 && yi >= 1
							&& (test6[xi][yi] == test6[xi + 1][yi - 1] && test6[xi][yi] == test6[xi - 1][yi + 1])) {
						if (test6[xi][yi] == 0) {
							JOptionPane.showMessageDialog(Fexam_D1051415_2.this, "Playier 1 win!!");
							break;
						} else if (test6[xi][yi] == 1) {
							JOptionPane.showMessageDialog(Fexam_D1051415_2.this, "Playier 2 win!!");
							break;
						}
					} else if (yi >= 2
							&& (test6[xi][yi] == test6[xi + 1][yi - 1] && test6[xi][yi] == test6[xi + 2][yi - 2])) {
						if (test6[xi][yi] == 0) {
							JOptionPane.showMessageDialog(Fexam_D1051415_2.this, "Playier 1 win!!");
							break;
						} else if (test6[xi][yi] == 1) {
							JOptionPane.showMessageDialog(Fexam_D1051415_2.this, "Playier 2 win!!");
							break;
						}
					}
				}
			} else if (len == 4) {
				for (int i = 0; i < a; i++) {
					if (test6[xi][i] == test6[xi][i + 1] && test6[xi][i] == test6[xi][i + 2]
							&& test6[xi][i] == test6[xi][i + 3]) {
						if (test6[xi][i] == 0) {
							JOptionPane.showMessageDialog(Fexam_D1051415_2.this, "Playier 1 win!!");
						} else if (test6[xi][i] == 1) {
							JOptionPane.showMessageDialog(Fexam_D1051415_2.this, "Playier 2 win!!");
						}
					} else if (test6[i][yi] == test6[i + 1][yi] && test6[i][yi] == test6[i + 2][yi]
							&& test6[i][yi] == test6[i + 3][yi]) {
						if (test6[i][yi] == 0) {
							JOptionPane.showMessageDialog(Fexam_D1051415_2.this, "Playier 1 win!!");
						} else if (test6[i][yi] == 1) {
							JOptionPane.showMessageDialog(Fexam_D1051415_2.this, "Playier 2 win!!");
						}
					} else if ((test6[xi][yi] == test6[xi + 1][yi + 1] && test6[xi][yi] == test6[xi + 2][yi + 2]
							&& test6[xi][yi] == test6[xi + 3][yi + 3])
							|| (xi >= 1 && yi >= 1 && test6[xi][yi] == test6[xi - 1][yi - 1]
									&& test6[xi][yi] == test6[xi + 1][yi + 1]
									&& test6[xi][yi] == test6[xi + 2][yi + 2])
							|| (xi >= 2 && yi >= 2 && test6[xi][yi] == test6[xi - 1][yi - 1]
									&& test6[xi][yi] == test6[xi - 2][yi - 2]
									&& test6[xi][yi] == test6[xi + 1][yi + 1])
							|| (xi >= 3 && yi >= 3 && test6[xi][yi] == test6[xi - 1][yi - 1]
									&& test6[xi][yi] == test6[xi - 2][yi - 2]
									&& test6[xi][yi] == test6[xi - 3][yi - 3])) {
						if (test6[xi][yi] == 0) {
							JOptionPane.showMessageDialog(Fexam_D1051415_2.this, "Playier 1 win!!");
							break;
						} else if (test6[xi][yi] == 1) {
							JOptionPane.showMessageDialog(Fexam_D1051415_2.this, "Playier 2 win!!");
							break;
						}
					} else if (xi >= 3
							&& (test6[xi][yi] == test6[xi - 1][yi + 1] && test6[xi][yi] == test6[xi - 2][yi + 2]
									&& test6[xi][yi] == test6[xi - 3][yi + 3])
							|| (xi >= 2 && yi >= 1 && test6[xi][yi] == test6[xi + 1][yi - 1]
									&& test6[xi][yi] == test6[xi - 1][yi + 1]
									&& test6[xi][yi] == test6[xi - 2][yi + 2])
							|| (xi >= 1 && yi >= 2 && test6[xi][yi] == test6[xi + 1][yi - 1]
									&& test6[xi][yi] == test6[xi + 2][yi - 2]
									&& test6[xi][yi] == test6[xi - 1][yi + 1])
							|| (yi >= 3 && test6[xi][yi] == test6[xi + 1][yi - 1]
									&& test6[xi][yi] == test6[xi + 2][yi - 2]
									&& test6[xi][yi] == test6[xi + 3][yi - 3])) {
						if (test6[xi][yi] == 0) {
							JOptionPane.showMessageDialog(Fexam_D1051415_2.this, "Playier 1 win!!");
							break;
						} else if (test6[xi][yi] == 1) {
							JOptionPane.showMessageDialog(Fexam_D1051415_2.this, "Playier 2 win!!");
							break;
						}
					}
				}
			} else if (len == 5) {
				for (int i = 0; i < a; i++) {
					if (test6[xi][i] == test6[xi][i + 1] && test6[xi][i] == test6[xi][i + 2]
							&& test6[xi][i] == test6[xi][i + 3]
							&& test6[xi][i] == test6[xi][i + 4]) {
						if (test6[xi][i] == 0) {
							JOptionPane.showMessageDialog(Fexam_D1051415_2.this, "Playier 1 win!!");
						} else if (test6[xi][i] == 1) {
							JOptionPane.showMessageDialog(Fexam_D1051415_2.this, "Playier 2 win!!");
						}
					} else if (test6[i][yi] == test6[i + 1][yi] && test6[i][yi] == test6[i + 2][yi]
							&& test6[i][yi] == test6[i + 3][yi] && test6[i][yi] == test6[i + 4][yi]) {
						if (test6[i][yi] == 0) {
							JOptionPane.showMessageDialog(Fexam_D1051415_2.this, "Playier 1 win!!");
						} else if (test6[i][yi] == 1) {
							JOptionPane.showMessageDialog(Fexam_D1051415_2.this, "Playier 2 win!!");
						}
					} else if ((test6[xi][yi] == test6[xi + 1][yi + 1] && test6[xi][yi] == test6[xi + 2][yi + 2]
							&& test6[xi][yi] == test6[xi + 3][yi + 3] && test6[xi][yi] == test6[xi + 4][yi + 4])
							|| (xi >= 1 && yi >= 1 && test6[xi][yi] == test6[xi - 1][yi - 1]
									&& test6[xi][yi] == test6[xi + 1][yi + 1]
									&& test6[xi][yi] == test6[xi + 2][yi + 2] && test6[xi][yi] == test6[xi + 3][yi + 3])
							|| (xi >= 2 && yi >= 1 && test6[xi][yi] == test6[xi - 1][yi - 1]
									&& test6[xi][yi] == test6[xi - 2][yi - 2]
									&& test6[xi][yi] == test6[xi + 1][yi + 1] && test6[xi][yi] == test6[xi + 2][yi + 2])
							|| (xi >= 3 && yi >= 3 && test6[xi][yi] == test6[xi - 1][yi - 1]
									&& test6[xi][yi] == test6[xi - 2][yi - 2]
									&& test6[xi][yi] == test6[xi - 3][yi - 3] && test6[xi][yi] == test6[xi + 1][yi + 1])
							|| (xi >= 4 && yi >= 4 && test6[xi][yi] == test6[xi - 1][yi - 1]
									&& test6[xi][yi] == test6[xi - 2][yi - 2]
									&& test6[xi][yi] == test6[xi - 3][yi - 3]
									&& test6[xi][yi] == test6[xi - 4][yi - 4])) {
						if (test6[xi][yi] == 0) {
							JOptionPane.showMessageDialog(Fexam_D1051415_2.this, "Playier 1 win!!");
							break;
						} else if (test6[xi][yi] == 1) {
							JOptionPane.showMessageDialog(Fexam_D1051415_2.this, "Playier 2 win!!");
							break;
						}
					} else if ((xi >= 4 && test6[xi][yi] == test6[xi - 1][yi + 1]
							&& test6[xi][yi] == test6[xi - 2][yi + 2]
							&& test6[xi][yi] == test6[xi - 3][yi + 3] && test6[xi][yi] == test6[xi - 4][yi + 4])
							|| (xi >= 3 && yi >= 1 && test6[xi][yi] == test6[xi + 1][yi - 1]
									&& test6[xi][yi] == test6[xi - 1][yi + 1]
									&& test6[xi][yi] == test6[xi - 2][yi + 2] && test6[xi][yi] == test6[xi - 3][yi + 3])
							|| (xi >= 2 && yi >= 2 && test6[xi][yi] == test6[xi + 1][yi - 1]
									&& test6[xi][yi] == test6[xi + 2][yi - 2]
									&& test6[xi][yi] == test6[xi - 1][yi + 1] && test6[xi][yi] == test6[xi - 2][yi + 2])
							|| (xi >= 1 && yi >= 3 && test6[xi][yi] == test6[xi + 1][yi - 1]
									&& test6[xi][yi] == test6[xi + 2][yi - 2]
									&& test6[xi][yi] == test6[xi + 3][yi - 3] && test6[xi][yi] == test6[xi - 1][yi + 1])
							|| (yi >= 4 && test6[xi][yi] == test6[xi + 1][yi - 1]
									&& test6[xi][yi] == test6[xi + 2][yi - 2]
									&& test6[xi][yi] == test6[xi + 3][yi - 3]
									&& test6[xi][yi] == test6[xi + 4][yi - 4])) {
						if (test6[xi][yi] == 0) {
							JOptionPane.showMessageDialog(Fexam_D1051415_2.this, "Playier 1 win!!");
							break;
						} else if (test6[xi][yi] == 1) {
							JOptionPane.showMessageDialog(Fexam_D1051415_2.this, "Playier 2 win!!");
							break;
						}
					}

				}
			}
		} else {
			JOptionPane.showMessageDialog(Fexam_D1051415_2.this, "DRAW!!");
		}
	}
}