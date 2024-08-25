package virtualMobileMachine;

import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Phone extends Frame {

	Button teacupButton;
	Button vmButton1;
	Button vmButton2;
	Button vmButton3;
	Button vmButton4;
	TextArea infoArea;

	Phone(String title) {
		super(title);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent ev) {
				System.exit(0);
			}
		});
		setSize(900, 500);
		setLayout(null); // Use null layout for absolute positioning
		setVisible(true);

		// Add Nokia 3310 button
		teacupButton = new Button("Nokia 3310");
		teacupButton.setBounds(10, 147, 140, 30);
		add(teacupButton);

		// Add action listener to Nokia 3310 button
		teacupButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayNokiaInfo();
			}
		});

		// Add action listener to Nokia 3310 button
		teacupButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addVMButtons();
			}
		});
		
		// Add Redmi Note 9Pro button
		teacupButton = new Button("Redmi Note 9Pro");
		teacupButton.setBounds(10, 200, 140, 30);
		add(teacupButton);

		// Add action listener to Redmi Note 9Pro button
		teacupButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayRedmiInfo();
			}
		});

		// Add action listener to Redmi Note 9Pro button
		teacupButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addVMButtons();
			}
		});
		
		// Add IPhone button
				teacupButton = new Button("iPhone 15 Pro Max");
				teacupButton.setBounds(10, 253, 140, 30);
				add(teacupButton);

				// Add action listener to Redmi Note 9Pro button
				teacupButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						displayiPhoneInfo();
					}
				});

				// Add action listener to Redmi Note 9Pro button
				teacupButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						addVMButtons();
					}
				});
		
		// Add TextArea for displaying information
		infoArea = new TextArea();
		infoArea.setBounds(170, 150, 700, 300);
		infoArea.setEditable(false);
		add(infoArea);
	}

	int x1 = 10;
	// calc
	int x2 = x1 + 176;
	int x3 = x2 + 176;
	int x4 = x3 + 176;

	// Method to add virtual machine setting buttons
	private void addVMButtons() {
		// Remove existing buttons if any
		if (vmButton1 != null)
			remove(vmButton1);
		if (vmButton2 != null)
			remove(vmButton2);
		if (vmButton3 != null)
			remove(vmButton3);
		if (vmButton4 != null)
			remove(vmButton4);
		// Add VM setting buttons
		vmButton1 = new Button("Start");
		vmButton1.setBounds(x1, 50, 140, 30);
		add(vmButton1);

		vmButton2 = new Button("Settings");
		vmButton2.setBounds(x2, 50, 140, 30);
		add(vmButton2);

		vmButton3 = new Button("Back");
		vmButton3.setBounds(x3, 50, 140, 30);
		add(vmButton3);

		vmButton4 = new Button("Next");
		vmButton4.setBounds(x4, 50, 140, 30);
		add(vmButton4);
		// Refresh the frame to show new buttons
		validate();
		repaint();
	}

	// Method to display Nokia 3310 information
	private void displayNokiaInfo() {
		String info = "Nokia 3310:\n\n"
				+ "The Nokia 3310 is a GSM mobile phone announced on September 1, 2000, and released in the fourth quarter of the year. \n\n "
				+ "It replaced the popular Nokia 3210 and became one of the most successful phones with 126 million units sold worldwide.\n\n "
				+ "The phone is known for its durability and long battery life, and it has gained a cult status over the years.\n\n "
				+ "In 2017, a new version of the Nokia 3310 was released with updated features like a color display and a camera.\n\n";
		infoArea.setText(info);
	}
	// Method to display Redmi information
	private void displayRedmiInfo() {
		String info = "Redmi Note 9Pro:\n\n"
				+ "The Redmi Note 9 Pro is a mid-range smartphone from Xiaomi, known for its impressive features and affordability. Here are some key highlights: \n\n "
				+ "Display: 6.67-inch IPS LCD with a resolution of 1080 x 2400 pixels.\n\n "
				+ "Processor: Qualcomm Snapdragon 720G, suitable for gaming and multitasking.\n\n "
				+ "Cameras: Quad-camera setup with a 64 MP main sensor, 8 MP ultra-wide, 5 MP macro, and 2 MP depth sensor. The front camera is 16 MP.\n\n"
				+ "Battery: 5020 mAh with 30W fast charging.\n\n"
				+ "Operating System: Initially launched with Android 10, upgradable to newer versions.\n\n"
				+ "Build: Glass front and back with a plastic frame, weighing 209 grams.\n\n"
				+ "Additional Features: Side-mounted fingerprint sensor, NFC, and support for 4K video recording\n\n";
				
		infoArea.setText(info);
	}
	// Method to display Apple information
	private void displayiPhoneInfo() {
		String info = "iPhone 15 Pro Max:\n\n"
				+ "The iPhone 15 Pro Max is Apple’s flagship smartphone, released in September 2023. Here are some key features: \n\n "
				+ "Display: 6.7-inch Super Retina XDR display with ProMotion technology for smoother scrolling and better responsiveness.\n\n "
				+ "Processor: Powered by the A17 Pro chip, offering exceptional performance and efficiency.\n\n "
				+ "Cameras: Triple-camera system with a 48 MP main sensor, 12 MP ultra-wide, and 12 MP telephoto lens. It also features the most powerful optical zoom in iPhone history.\n\n"
				+ "Battery: 4441 mAh battery, supporting up to 29 hours of video playback.\n\n"
				+ "Build: Made from titanium, which is both strong and lightweight. The device also features Ceramic Shield glass for added durability.\n\n"
				+ "Additional Features: USB-C port with USB 3 support, satellite emergency SOS, crash detection, and a programmable Action button\n\n";
				
		infoArea.setText(info);
	}
	// Main method for code running
	public static void main(String[] args) {
		Phone painter = new Phone("Phone 1");
	}

	// Method paint for shapes painting
	public void paint(Graphics painter) {
		// Main Rect
		painter.setColor(new Color(0, 247, 255)); // Background
		painter.drawRect(0, 0, 900, 500); // Background
		painter.fillRect(0, 0, 900, 500); // Background
		// Version Window
		painter.setColor(new Color(0, 0, 0)); // Version Window
		painter.drawRect(0, 0, 160, 500); // Version Window
		painter.setColor(new Color(255, 255, 255)); // Version Window
		painter.fillRect(0, 0, 160, 500); // Version Window
		// Settings
		painter.setColor(new Color(0, 0, 0)); // Settings
		painter.drawRect(0, 0, 900, 121); // Settings
		painter.setColor(new Color(0, 171, 255)); // Settings
		painter.fillRect(0, 0, 900, 121); // Settings
	}
}

//		addWindowListener(new WindowAdapter() {
// public void windowClosing(WindowEvent e) {
// System.exit(0);
// }
// });
// }

//	private void openNewWindow() {
//
// }

//}