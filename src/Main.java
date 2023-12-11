import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Main {

	private JFrame frmRpgCharacterMaker;
	private JTable table;
	private JTextField textFieldName;
	public CharacterList characterList;
	private JTextField textFieldID;
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmRpgCharacterMaker.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void loadCharacterTable() {
		DefaultTableModel model = new DefaultTableModel(new Object[]{"ID", "Name", "Level", "Class"},0);
	
		
		for(int i=0; i<characterList.listOfCharacters.size();i++) {
			Object row[] = new Object[]{characterList.listOfCharacters.get(i).getId(), 
										characterList.listOfCharacters.get(i).getName(), 
										characterList.listOfCharacters.get(i).getLevel(), 
										characterList.listOfCharacters.get(i).getClass().getSimpleName()};
			model.addRow(row);
		}
		
		table.setModel(model);
	}
	
	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		characterList = new CharacterList();
		frmRpgCharacterMaker = new JFrame();
		frmRpgCharacterMaker.getContentPane().setBackground(new Color(255, 255, 255));
		frmRpgCharacterMaker.setBackground(new Color(255, 255, 255));
		frmRpgCharacterMaker.setTitle("RPG Character Maker");
		frmRpgCharacterMaker.setBounds(100, 100, 920, 526);
		frmRpgCharacterMaker.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRpgCharacterMaker.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Character List");
		lblNewLabel.setFont(new Font("Bell MT", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(375, 10, 133, 46);
		frmRpgCharacterMaker.getContentPane().add(lblNewLabel);
		
		textFieldName = new JTextField();
		textFieldName.setFont(new Font("Bell MT", Font.PLAIN, 12));
		textFieldName.setBounds(47, 291, 96, 19);
		frmRpgCharacterMaker.getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Character Name");
		lblNewLabel_1.setFont(new Font("Bell MT", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(47, 273, 96, 13);
		frmRpgCharacterMaker.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Class");
		lblNewLabel_2.setFont(new Font("Bell MT", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(47, 320, 45, 13);
		frmRpgCharacterMaker.getContentPane().add(lblNewLabel_2);
		
		ButtonGroup characterClass = new ButtonGroup();
		
		JRadioButton rdbtnRanger = new JRadioButton("Ranger");
		rdbtnRanger.setBackground(new Color(255, 255, 255));
		rdbtnRanger.setFont(new Font("Bell MT", Font.PLAIN, 12));
		rdbtnRanger.setBounds(47, 337, 103, 21);
		characterClass.add(rdbtnRanger);
		frmRpgCharacterMaker.getContentPane().add(rdbtnRanger);
		
		JRadioButton rdbtnWarrior = new JRadioButton("Warrior");
		rdbtnWarrior.setBackground(new Color(255, 255, 255));
		rdbtnWarrior.setFont(new Font("Bell MT", Font.PLAIN, 12));
		rdbtnWarrior.setBounds(47, 360, 103, 21);
		characterClass.add(rdbtnWarrior);
		frmRpgCharacterMaker.getContentPane().add(rdbtnWarrior);
		
		JRadioButton rdbtnWizard = new JRadioButton("Wizard");
		rdbtnWizard.setBackground(new Color(255, 255, 255));
		rdbtnWizard.setFont(new Font("Bell MT", Font.PLAIN, 12));
		rdbtnWizard.setBounds(47, 383, 103, 21);
		characterClass.add(rdbtnWizard);
		frmRpgCharacterMaker.getContentPane().add(rdbtnWizard);
		
		textFieldID = new JTextField();
		textFieldID.setFont(new Font("Bell MT", Font.PLAIN, 12));
		textFieldID.setBounds(650, 155, 85, 19);
		frmRpgCharacterMaker.getContentPane().add(textFieldID);
		textFieldID.setColumns(10);
		
		JPanel characterPanel = new JPanel();
		characterPanel.setBackground(new Color(255, 255, 255));
		characterPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		characterPanel.setBounds(444, 273, 434, 188);
		frmRpgCharacterMaker.getContentPane().add(characterPanel);
		characterPanel.setLayout(null);
		
		JLabel lblCharname = new JLabel("Select a Character");
		lblCharname.setBounds(168, 27, 165, 15);
		lblCharname.setFont(new Font("Bell MT", Font.BOLD, 14));
		characterPanel.add(lblCharname);
		
		JLabel lblNewLabel_4 = new JLabel("Level:");
		lblNewLabel_4.setFont(new Font("Bell MT", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(168, 75, 45, 13);
		characterPanel.add(lblNewLabel_4);
		
		JLabel lblLevel = new JLabel("");
		lblLevel.setFont(new Font("Bell MT", Font.PLAIN, 12));
		lblLevel.setBounds(209, 75, 45, 13);
		characterPanel.add(lblLevel);
		
		JLabel lblNewLabel_5 = new JLabel("Class:");
		lblNewLabel_5.setFont(new Font("Bell MT", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(168, 97, 45, 13);
		characterPanel.add(lblNewLabel_5);
		
		JLabel lblCharacterClass = new JLabel("");
		lblCharacterClass.setFont(new Font("Bell MT", Font.PLAIN, 12));
		lblCharacterClass.setBounds(209, 97, 97, 13);
		characterPanel.add(lblCharacterClass);
		
		JLabel lblNewLabel_6 = new JLabel("Stats:");
		lblNewLabel_6.setFont(new Font("Bell MT", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(34, 130, 45, 13);
		characterPanel.add(lblNewLabel_6);
		
		JLabel lblStats = new JLabel("");
		lblStats.setFont(new Font("Bell MT", Font.PLAIN, 12));
		lblStats.setBounds(89, 120, 335, 33);
		characterPanel.add(lblStats);
		
		JLabel lblPortrait = new JLabel("");
		lblPortrait.setBounds(65, 17, 85, 83);
		characterPanel.add(lblPortrait);
		
		JLabel lblNewLabel_4_1 = new JLabel("ID:");
		lblNewLabel_4_1.setFont(new Font("Bell MT", Font.PLAIN, 12));
		lblNewLabel_4_1.setBounds(168, 52, 45, 13);
		characterPanel.add(lblNewLabel_4_1);
		
		JLabel lblId = new JLabel("");
		lblId.setFont(new Font("Bell MT", Font.PLAIN, 12));
		lblId.setBounds(209, 52, 45, 13);
		characterPanel.add(lblId);
		
		JLabel lblErrorCreate = new JLabel("");
		lblErrorCreate.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblErrorCreate.setBounds(47, 410, 133, 13);
		frmRpgCharacterMaker.getContentPane().add(lblErrorCreate);
		
		JLabel lblError = new JLabel("");
		lblError.setHorizontalAlignment(SwingConstants.CENTER);
		lblError.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblError.setBounds(47, 471, 275, 13);
		frmRpgCharacterMaker.getContentPane().add(lblError);
		
		JLabel lblCharacterNumber = new JLabel("0");
		lblCharacterNumber.setFont(new Font("Bell MT", Font.PLAIN, 12));
		lblCharacterNumber.setBounds(212, 219, 25, 13);
		frmRpgCharacterMaker.getContentPane().add(lblCharacterNumber);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.setFont(new Font("Bell MT", Font.PLAIN, 12));
		btnCreate.setForeground(new Color(255, 255, 255));
		btnCreate.setBackground(new Color(128, 128, 64));
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Character newCharacter;
				String name = textFieldName.getText();
				
				if (name.isBlank()) {
					lblErrorCreate.setText("Please type a name.");
				}
				try {
					
					if (rdbtnRanger.isSelected()) {
						newCharacter = new Ranger(name);
						characterList.addCharacter(newCharacter);
					} else if (rdbtnWizard.isSelected()) {
						newCharacter = new Wizard(name);
						characterList.addCharacter(newCharacter);
					} else {
						newCharacter = new Warrior(name);
						characterList.addCharacter(newCharacter);
					}
					loadCharacterTable();
					lblCharacterNumber.setText("" + characterList.listOfCharacters.size());
					textFieldName.setText("");
					lblErrorCreate.setText("");
					lblError.setText("");
				} catch (CharacterNotFoundException error) {
					lblError.setText("Could not create Character.");
				
					error.printStackTrace();				
				}
			}
		});
		btnCreate.setBounds(129, 430, 96, 31);
		frmRpgCharacterMaker.getContentPane().add(btnCreate);
		
		JLabel lblErrorVieworDelete = new JLabel("");
		lblErrorVieworDelete.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblErrorVieworDelete.setBounds(741, 158, 155, 13);
		frmRpgCharacterMaker.getContentPane().add(lblErrorVieworDelete);
		
		JButton btnView = new JButton("View");
		btnView.setFont(new Font("Bell MT", Font.PLAIN, 12));
		btnView.setForeground(new Color(255, 255, 255));
		btnView.setBackground(new Color(128, 128, 64));
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = tryParse(textFieldID.getText());
				
				if (id == 0) {
					lblErrorVieworDelete.setText("Please enter a valid ID.");
				} else {
					try {
						Character selectedCharacter = characterList.getCharacterById(id);
						lblId.setText("" + selectedCharacter.getId());
						lblCharname.setText("" + selectedCharacter.getName());
						lblLevel.setText("" + selectedCharacter.getLevel());
						lblCharacterClass.setText("" + selectedCharacter.getClass().getSimpleName());
						if (selectedCharacter.getClass().getSimpleName() == "Warrior") {
							lblPortrait.setIcon(new ImageIcon(".\\assets\\warrior.jpg"));
							lblStats.setText("Health: " + selectedCharacter.getHealth() + 
											"  " + "Attack: " + selectedCharacter.getAttack() + 
											"  " + "Strength: " + selectedCharacter.getStrength() + 
											"  " + "Defence: " + selectedCharacter.getDefence());
						} else if (selectedCharacter.getClass().getSimpleName() == "Wizard") {
							lblPortrait.setIcon(new ImageIcon(".\\assets\\wizard.jpg"));
							lblStats.setText("Health: " + selectedCharacter.getHealth() + 
									"  " + "Wisdom: " + selectedCharacter.getWisdom() + 
									"  " + "Intelligence: " + selectedCharacter.getIntelligence() + 
									"  " + "Defence: " + selectedCharacter.getDefence());
						} else if (selectedCharacter.getClass().getSimpleName() == "Ranger") {
							lblPortrait.setIcon(new ImageIcon(".\\assets\\ranger.jpg"));
							lblStats.setText("Health: " + selectedCharacter.getHealth() + 
									"  " + "Accuracy: " + selectedCharacter.getAccuracy() + 
									"  " + "Dexterity: " + selectedCharacter.getDexterity() + 
									"  " + "Defence: " + selectedCharacter.getDefence());
						}
						
						
						lblErrorVieworDelete.setText("");
						textFieldID.setText("");
						
						
					} catch (CharacterNotFoundException error) {
						lblErrorVieworDelete.setText("Character not found!");
					}
				}


				
				
			}
		});
		btnView.setBounds(650, 184, 85, 21);
		frmRpgCharacterMaker.getContentPane().add(btnView);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Bell MT", Font.PLAIN, 12));
		btnDelete.setForeground(new Color(255, 255, 255));
		btnDelete.setBackground(new Color(128, 128, 64));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = tryParse(textFieldID.getText());
				
				if (id == 0) {
					lblErrorVieworDelete.setText("Please enter a valid ID.");
				} else {
					try {
						characterList.removeCharacter(id);
						loadCharacterTable();
						lblCharacterNumber.setText("" + characterList.listOfCharacters.size());
						lblErrorVieworDelete.setText("");
						textFieldID.setText("");
					} catch (CharacterNotFoundException error) {
						lblErrorVieworDelete.setText("Character not found!");
					}
				}
			}
		});
		btnDelete.setBounds(650, 215, 85, 21);
		frmRpgCharacterMaker.getContentPane().add(btnDelete);
		
		JLabel lblProfilePic = new JLabel();
		lblProfilePic.setIcon(new ImageIcon(".\\assets\\new_char.png"));
		lblProfilePic.setBounds(201, 294, 103, 120);
		frmRpgCharacterMaker.getContentPane().add(lblProfilePic);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 247, 886, 2);
		frmRpgCharacterMaker.getContentPane().add(separator);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(247, 47, 393, 189);
		frmRpgCharacterMaker.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setEnabled(false);
		table.setFont(new Font("Bell MT", Font.PLAIN, 12));
		scrollPane.setViewportView(table);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		
		JLabel lblNumberOfCharacters = new JLabel("Number of Characters:");
		lblNumberOfCharacters.setFont(new Font("Bell MT", Font.PLAIN, 12));
		lblNumberOfCharacters.setBounds(65, 219, 137, 13);
		frmRpgCharacterMaker.getContentPane().add(lblNumberOfCharacters);
		
		JButton btnLevelUp = new JButton("Level Up");
		btnLevelUp.setBackground(new Color(128, 128, 64));
		btnLevelUp.setForeground(new Color(255, 255, 255));
		btnLevelUp.setFont(new Font("Bell MT", Font.PLAIN, 12));
		btnLevelUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = tryParse(lblId.getText());
				
				if (id == 0) {
					lblErrorVieworDelete.setText("Please select a character.");
				} else {
					try {
						Character selectedCharacter = characterList.getCharacterById(id);
						selectedCharacter.levelUp();
						loadCharacterTable();
						lblLevel.setText("" + selectedCharacter.getLevel());
						if (selectedCharacter.getClass().getSimpleName() == "Warrior") {
							lblStats.setText("Health: " + selectedCharacter.getHealth() + 
											"  " + "Attack: " + selectedCharacter.getAttack() + 
											"  " + "Strength: " + selectedCharacter.getStrength() + 
											"  " + "Defence: " + selectedCharacter.getDefence());
						} else if (selectedCharacter.getClass().getSimpleName() == "Wizard") {
							lblStats.setText("Health: " + selectedCharacter.getHealth() + 
									"  " + "Wisdom: " + selectedCharacter.getWisdom() + 
									"  " + "Intelligence: " + selectedCharacter.getIntelligence() + 
									"  " + "Defence: " + selectedCharacter.getDefence());
						} else if (selectedCharacter.getClass().getSimpleName() == "Ranger") {
							lblStats.setText("Health: " + selectedCharacter.getHealth() + 
									"  " + "Accuracy: " + selectedCharacter.getAccuracy() + 
									"  " + "Dexterity: " + selectedCharacter.getDexterity() + 
									"  " + "Defence: " + selectedCharacter.getDefence());
						}
						
						lblErrorVieworDelete.setText("");
						textFieldID.setText("");
						
						
					} catch (CharacterNotFoundException error) {
						lblErrorVieworDelete.setText("Character not found!");
					}
				
			}
		}
		});
		btnLevelUp.setBounds(169, 157, 118, 21);
		characterPanel.add(btnLevelUp);
		
		JLabel lblNewLabel_7 = new JLabel("Enter an ID:");
		lblNewLabel_7.setFont(new Font("Bell MT", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(650, 132, 82, 13);
		frmRpgCharacterMaker.getContentPane().add(lblNewLabel_7);
		

		
		
		

	}
	
	public static Integer tryParse(String text) {
		  try {
		    return Integer.parseInt(text);
		  } catch (NumberFormatException e) {
		    return 0;
		  }
		}
}
