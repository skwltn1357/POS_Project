package products.view.bottom;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.CompoundBorder;

public class OriF extends JFrame{

	public OriF() {
		
		setBounds(228, 200, 400, 460);
		setLayout(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		getContentPane().setBackground(new Color(255,254,230));
		
		JLabel title = new JLabel("������ ǥ����");
		title.setFont(new Font("�޸յձ�������", Font.PLAIN, 15));
		title.setBounds(147, 18, 109, 26);
		add(title);

		String[] columnNames = {"����","������"};
		String[][] data = {
				{"����","������[�̱���]"},
				{"����","������[�̱���]"},
				{"�򷯽�","��[�̱���]"},
				{"�ֵ��� �ҽ���","��������[������]"},
				{"�����̽� �ҽ���","����[������]"},
				{"�ֵ��� ��","��[�̱���,ĳ���ٻ�]"},
				{"��¡�� ����","��¡��[ĥ����]"},
				{"��¡�� �ٸ�","��¡��[������]"},
				{"����ġŲ","�߰���[�±���]"},
				{"������","��¡��[����]"},
				{"��Ʈ��ġ��","ġ��[�̱���]"},
				{"������","������[�̱���]"}
		};

		JTable table = new JTable(data, columnNames);
		table.setBorder(new CompoundBorder());
		table.setCellSelectionEnabled(true);
		table.setEnabled(true);
		table.setRowHeight(25);
		table.setShowGrid(true);
		table.setFont(new Font("�޸յձ�������", Font.PLAIN, 20));

		// table �׵θ��� lightGray�� �־���
		table.setGridColor(Color.lightGray);
		table.setBorder(BorderFactory.createLineBorder(table.getGridColor()));
		
		table.setBounds(38, 72, 330, 299);
		add(table);

		JLabel division = new JLabel("����");
		division.setBounds(100, 44, 61, 16);
		add(division);

		JLabel origin = new JLabel("������");
		origin.setBounds(260, 44, 61, 16);
		add(origin);
	}
}
