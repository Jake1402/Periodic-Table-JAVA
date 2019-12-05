package layout;

import Calculator.calc;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

@SuppressWarnings("serial")
public class Layout extends JFrame {
	
	boolean hide = true;
	
	public JFrame jf = new JFrame("Periodic Table | By Jake Watson");
	
	public JButton Table = new JButton ("Periodic Table");
	public JButton Mol = new JButton("Mol Calculator");
	public JButton about = new JButton("About & Help");
	//public JButton help = new JButton("Help");
	
	public JButton H = new JButton("H"); 
	public JButton He = new JButton("He");
	public JButton Li = new JButton("Li");
	public JButton Be = new JButton("Be");
	public JButton B = new JButton("B");
	public JButton C = new JButton("C");
	public JButton N = new JButton("N");
	public JButton O = new JButton("O");
	public JButton F = new JButton("F");
	public JButton Ne = new JButton("Ne");
	public JButton Na = new JButton("Na");
	public JButton Mg = new JButton("Mg");
	public JButton Al = new JButton("Al");
	public JButton Si = new JButton("Si");
	public JButton P = new JButton("P");
	public JButton S = new JButton("S");
	public JButton Cl = new JButton("Cl");
	public JButton Ar = new JButton("Ar");
	/////*****Seperator*****/////
	public JButton K = new JButton("K");
	public JButton Ca = new JButton("Ca");
	public JButton Sc = new JButton("Sc");
	public JButton Ti = new JButton("Ti");
	public JButton V = new JButton("V");
	public JButton Cr = new JButton("Cr");
	public JButton Mn = new JButton("Mn");
	public JButton Fe = new JButton("Fe");
	public JButton Co = new JButton("Co");
	public JButton Ni = new JButton("Ni");
	public JButton Cu = new JButton("Cu");
	public JButton Zn = new JButton("Zn");
	public JButton Ga = new JButton("Ga");
	public JButton Ge = new JButton("Ge");
	public JButton As = new JButton("As");
	public JButton Se = new JButton("Se");
	public JButton Br = new JButton("Br");
	public JButton Kr = new JButton("Kr");
	/////*****Seperator*****/////
	public JButton Rb = new JButton("Rb");
	public JButton Sr = new JButton("Sr");
	public JButton Y = new JButton("Y");
	public JButton Zr = new JButton("Zr");
	public JButton Nb = new JButton("Nb");
	public JButton Mo = new JButton("Mo");
	public JButton Tc = new JButton("Tc");
	public JButton Ru = new JButton("Ru");
	public JButton Rh = new JButton("Rh");
	public JButton Pd = new JButton("Pd");
	public JButton Ag = new JButton("Ag");
	public JButton Cd = new JButton("Cd");
	public JButton In = new JButton("In");
	public JButton Sn = new JButton("Sn");
	public JButton Sb = new JButton("Sb");
	public JButton Te = new JButton("Te");
	public JButton I = new JButton("I");
	public JButton Xe = new JButton("Xe");
/////*****Seperator*****/////
	public JButton Cs = new JButton("Cs");
	public JButton Ba = new JButton("Ba");
	public JButton La = new JButton("La");
	public JButton Hf = new JButton("Hf");
	public JButton Ta = new JButton("Ta");
	public JButton W = new JButton("W");
	public JButton Re = new JButton("Re");
	public JButton Os = new JButton("Os");
	public JButton Ir = new JButton("Ir");
	public JButton Pt = new JButton("Pt");
	public JButton Au = new JButton("Au");
	public JButton Hg = new JButton("Hg");
	public JButton Tl = new JButton("Tl");
	public JButton Pb = new JButton("Pb");
	public JButton Bi = new JButton("Bi");
	public JButton Po = new JButton("Po");
	public JButton At = new JButton("At");
	public JButton Rn = new JButton("Rn");
/////*****Seperator*****/////
	public JButton Fr = new JButton("Fr");
	public JButton Ra = new JButton("Ra");
	public JButton Ac = new JButton("Ac");
	public JButton Rf = new JButton("Rf");
	public JButton Db = new JButton("Db");
	public JButton Sg = new JButton("Sg");
	public JButton Bh = new JButton("Bh");
	public JButton Hs = new JButton("Hs");
	public JButton Mt = new JButton("Mt");
	public JButton Ds = new JButton("Ds");
	public JButton Rg = new JButton("Rg");
	public JButton Cn = new JButton("Cn");
	public JButton Uut = new JButton("Uut");
	public JButton Fl = new JButton("Fl");
	public JButton Uup = new JButton("Uup");
	public JButton Lv = new JButton("Lv");
	public JButton Uus = new JButton("Uus");
	public JButton Og = new JButton("Og");
	/////******Lanthanides*****//////
	public JButton Ce = new JButton("Ce");
	public JButton Pr = new JButton("Pr");
	public JButton Nd = new JButton("Nd");
	public JButton Pm = new JButton("Pm");
	public JButton Sm = new JButton("Sm");
	public JButton Eu = new JButton("Eu");
	public JButton Gd = new JButton("Gd");
	public JButton Tb = new JButton("Tb");
	public JButton Dy = new JButton("Dy");
	public JButton Ho = new JButton("Ho");
	public JButton Er = new JButton("Er");
	public JButton Tm = new JButton("Tm");
	public JButton Yb = new JButton("Yb");
	public JButton Lu = new JButton("Lu");
	/////*****Actinide thingys*****/////
	public JButton Th = new JButton("Th");
	public JButton Pa = new JButton("Pa");
	public JButton U = new JButton("U");
	public JButton Np = new JButton("Np");
	public JButton Pu = new JButton("Pu");
	public JButton Am = new JButton("Am");
	public JButton Cm = new JButton("Cm");
	public JButton Bk = new JButton("Bk");
	public JButton Cf = new JButton("Cf");
	public JButton Es = new JButton("Es");
	public JButton Fm = new JButton("Fm");
	public JButton Md = new JButton("Md");
	public JButton No = new JButton("No");
	public JButton Lr = new JButton("Lr");

	public JButton web = new JButton("To Github Page!");
	private Color NewColor = new Color(120,120,230);
	
	final int s = 50;
	
	public Layout(){
		Table.setBounds(0,0,376,30);
		Mol.setBounds(376, 0, 376, 30);
		about.setBounds(376*2, 0, 376, 30);
		///////////************sep***********////////////
		JLabel noble = new JLabel("Nobles");
		noble.setBounds(120, 725, 120, 30);
		noble.setFont(new Font("Schriftbild", Font.BOLD, 25));
		noble.setForeground(Color.GREEN);
		jf.add(noble);
		////////////************sep************//////////
		JLabel alkalines = new JLabel("Alkalines");
		alkalines.setBounds(0, 725, 120, 30);
		alkalines.setFont(new Font("Schriftbild", Font.BOLD, 25));
		alkalines.setForeground(Color.RED);
		jf.add(alkalines);
		////////************sep*************/////////////
		JLabel lanthanides = new JLabel("Lanthanides");
		lanthanides.setBounds(215, 725, 150, 30);
		lanthanides.setFont(new Font("Schriftbild", Font.BOLD, 25));
		lanthanides.setForeground(Color.LIGHT_GRAY);
		jf.add(lanthanides);
		//////////////***********sep*************///////////
		JLabel actinides = new JLabel("Actinides");
		actinides.setBounds(370,725,130,30);
		actinides.setFont(new Font("Schiftbild", Font.BOLD, 25));
		actinides.setForeground(Color.GRAY);
		jf.add(actinides);
		/////////////**********sep***************///////////
		JLabel halogens = new JLabel("Halogens");
		halogens.setForeground(Color.CYAN);
		halogens.setFont(new Font("Schiftbild", Font.BOLD, 25));
		halogens.setBounds(490,725,130,30);
		jf.add(halogens);
		//////////**********sep**************/////////
		JLabel AlkaEarth = new JLabel("Alkaline Earth Metals");
		AlkaEarth.setForeground(Color.ORANGE);
		AlkaEarth.setFont(new Font("Schiftbild", Font.BOLD, 25));
		AlkaEarth.setBounds(615, 725, 260, 30);
		jf.add(AlkaEarth);
		//////////**********sep**************/////////
		JLabel metaloids = new JLabel("Metaloids");
		metaloids.setForeground(Color.YELLOW);
		metaloids.setFont(new Font("Schiftbild", Font.BOLD, 25));
		metaloids.setBounds(875, 725, 130, 30);
		jf.add(metaloids);
		//////////**********sep**************/////////
		JLabel other_nonmetals = new JLabel("Other Non-metals");//I will thanos 1/2 the code
		other_nonmetals.setForeground(Color.MAGENTA);
		other_nonmetals.setBounds(0, 695, 220, 30);
		other_nonmetals.setFont(new Font("Schiftbild", Font.BOLD, 25));
		jf.add(other_nonmetals);
		//////////**********sep**************/////////
		JLabel tranny = new JLabel("Transistional Metals");
		tranny.setForeground(NewColor);
		tranny.setBounds(220, 695, 250, 30);
		tranny.setFont(new Font("Schiftbild", Font.BOLD, 25));
		jf.add(tranny);
		//////////**********sep**************/////////
		//JPanel metals = new JPanel();
		JLabel metal_s = new JLabel("Metals");
		metal_s.setForeground(Color.PINK);
		metal_s.setBounds(470,695,140,30);
		metal_s.setFont(new Font("Schiftbild", Font.BOLD, 25));
		jf.add(metal_s);
		//metals.add(metal_s);
		//////////**********sep**************/////////
		jf.add(Table);
		jf.add(Mol);
		jf.add(about);
		
		for(int x = 20; x < 1230; x++) {
			for(int y = 20; y < 800; y++) {
				
				if(x == 20 && y == 50) {
					H.setBounds(x, y, s, s);
					H.setToolTipText("Atomic Mass : 1, Atomic Number : 1");
					H.setBackground(Color.MAGENTA);
					jf.add(H);
				}
				if(x == 1040 && y == 50) {
					He.setBounds(x, y, s, s);
					He.setBackground(Color.GREEN);
					He.setToolTipText("Atomic Mass : 4, Atomic Number : 2");
					jf.add(He);
				}
				if(x == 20 && y == 110) {
					Li.setBounds(x, y, s, s);
					Li.setBackground(Color.RED);
					Li.setToolTipText("Atomic Mass : 7, Atomic Number : 3");
					jf.add(Li);
				}
				if(x == 80 && y == 110) {
					Be.setBounds(x, y, s, s);
					Be.setBackground(Color.ORANGE);
					Be.setToolTipText("Atomic Mass : 9, Atomic Number : 4");
					jf.add(Be);
				}
				if(x == 740 && y == 110) {
					B.setBounds(x, y, s, s);
					B.setBackground(Color.YELLOW);
					B.setToolTipText("Atomic Mass : 11, Atomic Number : 5");
					jf.add(B);
				}
				if(x == 800 && y == 110) {
					C.setBounds(x, y, s, s);
					C.setBackground(Color.MAGENTA);
					C.setToolTipText("Atomic Mass : 12, Atomic Number : 6");
					jf.add(C);
				}
				if(x == 860 && y == 110) {
					N.setBounds(x, y, s, s);
					N.setBackground(Color.MAGENTA);
					N.setToolTipText("Atomic Mass : 14, Atomic Number : 7");
					jf.add(N);
				}
				if(x == 920 && y == 110) {
					O.setBounds(x, y, s, s);
					O.setBackground(Color.MAGENTA);
					O.setToolTipText("Atomic Mass : 16, Atomic Number : 8");
					jf.add(O);
				}
				if(x == 980 && y == 110) {
					F.setBounds(x, y, s, s);
					F.setBackground(Color.CYAN);
					F.setToolTipText("Atomic Mass : 19, Atomic Number : 9");
					jf.add(F);
				}
				if(x == 1040 && y == 110) {
					Ne.setBounds(x, y, 50, s);
					Ne.setBackground(Color.GREEN);
					Ne.setToolTipText("Atomic Mass : 20, Atomic Number : 10");
					jf.add(Ne);
				}
				if(x == 20 && y == 170) {
					Na.setBounds(x, y, 50, s);
					Na.setBackground(Color.RED);
					Na.setToolTipText("Atomic Mass : 23, Atomic Number : 11");
					jf.add(Na);
				}
				if(x == 80 && y == 170) {
					Mg.setBounds(x, y, 51, s);
					Mg.setBackground(Color.ORANGE);
					Mg.setToolTipText("Atomic Mass : 24, Atomic Number : 12");
					jf.add(Mg);
				}
				if(x == 740 && y == 170) {
					Al.setBounds(x, y, s, s);
					Al.setBackground(NewColor);
					Al.setToolTipText("Atomic Mass : 27, Atomic Number : 13");
					jf.add(Al);
				}
				if(x == 800 && y == 170) {
					Si.setBounds(x, y, s, s);
					Si.setBackground(Color.YELLOW);
					Si.setToolTipText("Atomic Mass : 28, Atomic Number : 14");
					jf.add(Si);
				}
				if(x == 860 && y == 170) {
					P.setBounds(x, y, s, s);
					P.setBackground(Color.MAGENTA);
					P.setToolTipText("Atomic Mass : 31, Atomic Number : 15");
					jf.add(P);
				}
				if(x == 920 && y == 170) {
					S.setBounds(x, y, s, s);
					S.setBackground(Color.MAGENTA);
					S.setToolTipText("Atomic Mass : 32, Atomic Number : 16");
					jf.add(S);
				}
				if(x == 980 && y == 170) {
					Cl.setBounds(x, y, s, s);
					Cl.setBackground(Color.CYAN);
					Cl.setToolTipText("Atomic Mass : 35.5, Atomic Number : 17");
					jf.add(Cl);
				}
				if(x == 1040 && y == 170) {
					Ar.setBounds(x, y, s, s);
					Ar.setBackground(Color.GREEN);
					Ar.setToolTipText("Atomic Mass : 40, Atomic Number : 18");
					jf.add(Ar);
				}
				if(x == 20 && y == 230) {
					K.setBounds(x, y, s, s);
					K.setBackground(Color.RED);
					K.setToolTipText("Atomic Mass : 39, Atomic Number : 19");
					jf.add(K);
				}
				if(x == 80 && y == 230) {
					Ca.setBounds(x, y, s, s);
					Ca.setBackground(Color.ORANGE);
					Ca.setToolTipText("Atomic Mass : 40, Atomic Number : 20");
					jf.add(Ca);
				}
				if(x == 140 && y == 230) {
					Sc.setBounds(x, y, s, s);
					Sc.setBackground(Color.PINK);
					Sc.setToolTipText("Atomic Mass : 45, Atomic Number : 21");
					jf.add(Sc);
				}
				if(x == 200 && y == 230) {
					Ti.setBounds(200, 230, s, s);
					Ti.setBackground(Color.PINK);
					Ti.setToolTipText("Atomic Mass : 48, Atomic Number : 22");
					jf.add(Ti);
				}
				if(x == 260 && y == 230) {
					V.setBounds(x, y, s, s);
					V.setBackground(Color.PINK);
					V.setToolTipText("Atomic Mass : 51, Atomic Number : 23");
					jf.add(V);
				}
				if(x == 320 && y == 230) {
					Cr.setBounds(x, y, s, s);
					Cr.setBackground(Color.PINK);
					Cr.setToolTipText("Atomic Mass : 52, Atomic Number : 24");
					jf.add(Cr);
				}
				if(x == 380 && y == 230) {
					Mn.setBounds(x, y, 51, s);
					Mn.setBackground(Color.PINK);
					Mn.setToolTipText("Atomic Mass : 55, Atomic Number : 25");
					jf.add(Mn);
				}
				if(x == 440 && y == 230) {
					Fe.setBounds(x, y, s, s);
					Fe.setBackground(Color.PINK);
					Fe.setToolTipText("Atomic Mass : 56, Atomic Number : 26");
					jf.add(Fe);
				}
				if(x == 500 && y == 230) {
					Co.setBounds(x, y, s, s);
					Co.setBackground(Color.PINK);
					Co.setToolTipText("Atomic Mass : 59, Atomic Number : 27");
					jf.add(Co);
				}
				if(x == 560 && y == 230) {
					Ni.setBounds(x, y, s, s);
					Ni.setBackground(Color.PINK);
					Ni.setToolTipText("Atomic Mass : 59, Atomic Number : 28");
					jf.add(Ni);
				}
				if(x == 620 && y == 230) {
					Cu.setBounds(x, y, s, s);
					Cu.setBackground(Color.PINK);
					Cu.setToolTipText("Atomic Mass : 63.5, Atomic Number : 29");
					jf.add(Cu);
				}
				if(x == 680 && y == 230) {
					Zn.setBounds(x, y, s, s);
					Zn.setBackground(Color.PINK);
					Zn.setToolTipText("Atomic Mass : 65, Atomic Number : 30");
					jf.add(Zn);
				}
				if(x == 740 && y == 230) {
					Ga.setBounds(x, y, s, s);
					Ga.setBackground(NewColor);
					Ga.setToolTipText("Atomic Mass : 70, Atomic Number : 31");
					jf.add(Ga);
				}
				if(x == 800 && y == 230) {
					Ge.setBounds(x-2, y, s+4, s);
					Ge.setBackground(Color.YELLOW);
					Ge.setToolTipText("Atomic Mass : 73, Atomic Number : 32");
					jf.add(Ge);
				}
				if(x == 860 && y == 230) {
					As.setBounds(x, y, s, s);
					As.setBackground(Color.YELLOW);
					As.setToolTipText("Atomic Mass : 75, Atomic Number : 33");
					jf.add(As);
				}
				if(x == 920 && y == 230) {
					Se.setBounds(x, y, s, s);
					Se.setBackground(Color.MAGENTA);
					Se.setToolTipText("Atomic Mass : 79, Atomic Number : 34");
					jf.add(Se);
				}
				if(x == 980 && y == 230) {
					Br.setBounds(x, y, s, s);
					Br.setBackground(Color.CYAN);
					Br.setToolTipText("Atomic Mass : 80, Atomic Number : 35");
					jf.add(Br);
				}
				if(x == 1040 && y == 230) {
					Kr.setBounds(x, y, s, s);
					Kr.setBackground(Color.GREEN);
					Kr.setToolTipText("Atomic Mass : 84, Atomic Number : 36");
					jf.add(Kr);
				}
				if(x == 20 && y == 290) {
					Rb.setBounds(x, y, 52, s);
					Rb.setBackground(Color.RED);
					Rb.setToolTipText("Atomic Mass : 85, Atomic Number : 37");
					jf.add(Rb);
				}
				if(x == 80 && y == 290) {
					Sr.setBounds(x, y, s, s);
					Sr.setBackground(Color.ORANGE);
					Sr.setToolTipText("Atomic Mass : 88, Atomic Number : 38");
					jf.add(Sr);
				}
				if(x == 140 && y == 290) {
					Y.setBounds(x, y, s, s);
					Y.setBackground(Color.PINK);
					Y.setToolTipText("Atomic Mass : 89, Atomic Number : 39");
					jf.add(Y);
				}
				if(x == 200 && y == 290) {
					Zr.setBounds(x, y, s, s);
					Zr.setBackground(Color.PINK);
					Zr.setToolTipText("Atomic Mass : 91, Atomic Number : 40");
					jf.add(Zr);
				}
				if(x == 260 && y == 290) {
					Nb.setBounds(x, y, s, s);
					Nb.setBackground(Color.PINK);
					Nb.setToolTipText("Atomic Mass : 93, Atomic Number : 41");
					jf.add(Nb);
				}
				if(x == 320 && y == 290) {
					Mo.setBounds(x, y, 51, s);
					Mo.setBackground(Color.PINK);
					Mo.setToolTipText("Atomic Mass : 96, Atomic Number : 42");
					jf.add(Mo);
				}
				if(x == 380 && y == 290) {
					Tc.setBounds(x, y, s, s);
					Tc.setBackground(Color.PINK);
					Tc.setToolTipText("Atomic Mass : 98, Atomic Number : 43");
					jf.add(Tc);
				}
				if(x == 440 && y == 290) {
					Ru.setBounds(x, y, s, s);
					Ru.setBackground(Color.PINK);
					Ru.setToolTipText("Atomic Mass : 101, Atomic Number : 44");
					jf.add(Ru);
				}
				if(x == 500 && y == 290) {
					Rh.setBounds(x, y, s, s);
					Rh.setBackground(Color.PINK);
					Rh.setToolTipText("Atomic Mass : 103, Atomic Number : 45");
					jf.add(Rh);
				}
				if(x == 560 && y == 290) {
					Pd.setBounds(x, y, s, s);
					Pd.setBackground(Color.PINK);
					Pd.setToolTipText("Atomic Mass : 106, Atomic Number : 46");
					jf.add(Pd);
				}
				if(x == 620 && y == 290) {
					Ag.setBounds(x, y, s, s);
					Ag.setBackground(Color.PINK);
					Ag.setToolTipText("Atomic Mass : 108, Atomic Number : 47");
					jf.add(Ag);
				}
				if(x == 680 && y == 290) {
					Cd.setBounds(x, y, s, s);
					Cd.setBackground(Color.PINK);
					Cd.setToolTipText("Atomic Mass : 112, Atomic Number : 48");
					jf.add(Cd);
				}
				if(x == 740 && y == 290) {
					In.setBounds(x, y, s, s);
					In.setBackground(NewColor);
					In.setToolTipText("Atomic Mass : 115, Atomic Number : 49");
					jf.add(In);
				}
				if(x == 800 && y == 290) {
					Sn.setBounds(x, y, s, s);
					Sn.setBackground(NewColor);
					Sn.setToolTipText("Atomic Mass : 119, Atomic Number : 50");
					jf.add(Sn);
				}
				if(x == 860 && y == 290) {
					Sb.setBounds(x, y, s, s);
					Sb.setBackground(Color.YELLOW);
					Sb.setToolTipText("Atomic Mass : 122, Atomic Number : 51");
					jf.add(Sb);
				}
				if(x == 920 && y == 290) {
					Te.setBounds(x, y, s, s);
					Te.setBackground(Color.YELLOW);
					Te.setToolTipText("Atomic Mass : 128, Atomic Number : 52");
					jf.add(Te);
				}
				if(x == 980 && y == 290) {
					I.setBounds(x, y, s, s);
					I.setBackground(Color.CYAN);
					I.setToolTipText("Atomic Mass : 127, Atomic Number : 53");
					jf.add(I);
				}
				if(x == 1040 && y == 290) {
					Xe.setBounds(x, y, s, s);
					Xe.setBackground(Color.GREEN);
					Xe.setToolTipText("Atomic Mass : 131, Atomic Number : 54");
					jf.add(Xe);
				}
				if(x == 20 && y == 350) {
					Cs.setBounds(x, y, 52, s);
					Cs.setBackground(Color.RED);
					Cs.setToolTipText("Atomic Mass : 133, Atomic Number : 55");
					jf.add(Cs);
				}
				if(x == 80 && y == 350) {
					Ba.setBounds(x, y, s, s);
					Ba.setBackground(Color.ORANGE);
					Ba.setToolTipText("Atomic Mass : 137, Atomic Number : 56");
					jf.add(Ba);
				}
				if(x == 140 && y == 350) {
					La.setBounds(x, y, s, s);
					La.setBackground(Color.LIGHT_GRAY);
					La.setToolTipText("Atomic Mass : 139, Atomic Number : 57");
					jf.add(La);
				}
				if(x == 200 && y == 350) {
					Hf.setBounds(x, y, s, s);
					Hf.setBackground(Color.PINK);
					Hf.setToolTipText("Atomic Mass : 178.5, Atomic Number : 72");
					jf.add(Hf);
				}
				if(x == 260 && y == 350) {
					Ta.setBounds(x, y, s, s);
					Ta.setBackground(Color.PINK);
					Ta.setToolTipText("Atomic Mass : 181, Atomic Number : 73");
					jf.add(Ta);
				}
				if(x == 320 && y == 350) {
					W.setBounds(x, y, s, s);
					W.setBackground(Color.PINK);
					W.setToolTipText("Atomic Mass : 184, Atomic Number : 74");
					jf.add(W);
				}
				if(x == 380 && y == 350) {
					Re.setBounds(x, y, s, s);
					Re.setBackground(Color.PINK);
					Re.setToolTipText("Atomic Mass : 186, Atomic Number : 75");
					jf.add(Re);
				}
				if(x == 440 && y == 350) {
					Os.setBounds(x, y, s, s);
					Os.setBackground(Color.PINK);
					Os.setToolTipText("Atomic Mass : 190, Atomic Number : 76");
					jf.add(Os);
				}
				if(x == 500 && y == 350) {
					Ir.setBounds(x, y, s, s);
					Ir.setBackground(Color.PINK);
					Ir.setToolTipText("Atomic Mass : 192, Atomic Number : 77");
					jf.add(Ir);
				}
				if(x == 560 && y == 350) {
					Pt.setBounds(x, y, s, s);
					Pt.setBackground(Color.PINK);
					Pt.setToolTipText("Atomic Mass : 195, Atomic Number : 78");
					jf.add(Pt);
				}
				if(x == 620 && y == 350) {
					Au.setBounds(x, y, s, s);
					Au.setBackground(Color.PINK);
					Au.setToolTipText("Atomic Mass : 197, Atomic Number : 79");
					jf.add(Au);
				}
				if(x == 680 && y == 350) {
					Hg.setBounds(x, y, s, s);
					Hg.setBackground(Color.PINK);
					Hg.setToolTipText("Atomic Mass : 201, Atomic Number 80");
					jf.add(Hg);
				}
				if(x == 740 && y == 350) {
					Tl.setBounds(x, y, s, s);
					Tl.setBackground(NewColor);
					Tl.setToolTipText("Atomic Mass : 204, Atomic Number 81");
					jf.add(Tl);
				}
				if(x == 800 && y == 350) {
					Pb.setBounds(x, y, s, s);
					Pb.setBackground(NewColor);
					Pb.setToolTipText("Atomic Mass : 201, Atomic Number 82");
					jf.add(Pb);
				}
				if(x == 860 && y == 350) {
					Bi.setBounds(x, y, s, s);
					Bi.setBackground(NewColor);
					Bi.setToolTipText("Atomic Mass : 209, Atomic Number : 83");
					jf.add(Bi);
				}
				if(x == 920 && y == 350) {
					Po.setBounds(x, y, s, s);
					Po.setBackground(Color.YELLOW);
					Po.setToolTipText("Atomic Mass : 209, Atomic Number : 84");
					jf.add(Po);
				}
				if(x == 980 && y == 350) {
					At.setBounds(x, y, s, s);
					At.setBackground(Color.CYAN);
					At.setToolTipText("Atomic Mass : 210, Atomic Number : 85");
					jf.add(At);
				}
				if(x == 1040 && y == 350) {
					Rn.setBounds(x, y, s, s);
					Rn.setBackground(Color.GREEN);
					Rn.setToolTipText("Atomic Mass : 222, Atomic Number : 86");
					jf.add(Rn);
				}
				if(x == 20 && y == 410) {
					Fr.setBounds(x, y, 52, s);
					Fr.setBackground(Color.RED);
					Fr.setToolTipText("Atomic Mass : 223, Atomic Number : 87");
					jf.add(Fr);
				}
				if(x == 80 && y == 410) {
					Ra.setBounds(x, y, s, s);
					Ra.setBackground(Color.ORANGE);
					Ra.setToolTipText("Atomic Mass : 226, Atomic Number : 88");
					jf.add(Ra);
				}
				if(x == 140 && y == 410) {
					Ac.setBounds(x, y, s, s);
					Ac.setBackground(Color.GRAY);
					Ac.setToolTipText("Atomic Mass : 227, Atomic Number : 89");
					jf.add(Ac);
				}
				if(x == 200 && y == 410) {
					Rf.setBounds(x, y, s, s);
					Rf.setBackground(Color.PINK);
					Rf.setToolTipText("Atomic Mass : 267, Atomic Number : 104");
					jf.add(Rf);
				}
				if(x == 260 && y == 410) {
					Db.setBounds(x, y, s, s);
					Db.setBackground(Color.PINK);
					Db.setToolTipText("Atomic Mass : 268, Atomic Number : 105");
					jf.add(Db);
				}
				if(x == 320 && y == 410) {
					Sg.setBounds(x, y, s, s);
					Sg.setBackground(Color.PINK);
					Sg.setToolTipText("Atomic Mass : 269, Atomic Number : 106");
					jf.add(Sg);
				}
				if(x == 380 && y == 410) {
					Bh.setBounds(x, y, s, s);
					Bh.setBackground(Color.PINK);
					Bh.setToolTipText("Atomic Mass : 270, Atomic Number : 107");
					jf.add(Bh);
				}
				if(x == 440 && y == 410) {
					Hs.setBounds(x, y, s, s);
					Hs.setBackground(Color.PINK);
					Hs.setToolTipText("Atomic Mass : 278, Atomic Number : 108");
					jf.add(Hs);
				}
				if(x == 500 && y == 410) {
					Mt.setBounds(x, y, s, s);
					Mt.setBackground(Color.PINK);
					Mt.setToolTipText("Atomic Mass : 281, Atomic Number : 109");
					jf.add(Mt);
				}
				if(x == 560 && y == 410) {
					Ds.setBounds(x, y, s, s);
					Ds.setBackground(Color.PINK);
					Ds.setToolTipText("Atomic Mass : 282, Atomic Number : 110");
					jf.add(Ds);
				}
				if(x == 620 && y == 410) {
					Rg.setBounds(x, y, s, s);
					Rg.setBackground(Color.PINK);
					Rg.setToolTipText("Atomic Mass : 282, Atomic Number : 111");
					jf.add(Rg);
				}
				if(x == 680 && y == 410) {
					Cn.setBounds(x, y, s, s);
					Cn.setBackground(Color.PINK);
					Cn.setToolTipText("Atomic Mass : 285, Atomic Number : 112");
					jf.add(Cn);
				}
				if(x == 140 && y == 510) {
					Ce.setBounds(x, y, s, s);
					Ce.setBackground(Color.LIGHT_GRAY);
					Ce.setToolTipText("Atomic Mass : 140, Atomic Number : 58");
					jf.add(Ce);
				}
				if(x == 200 && y == 510) {
					Pr.setBounds(x, y, s, s);
					Pr.setBackground(Color.LIGHT_GRAY);
					Pr.setToolTipText("Atomic Mass : 141, Atomic Number : 59");
					jf.add(Pr);
				}
				if(x == 260 && y == 510) {
					Nd.setBounds(x, y, s, s);
					Nd.setBackground(Color.LIGHT_GRAY);
					Nd.setToolTipText("Atomic Mass : 144, Atomic Number : 60");
					jf.add(Nd);
				}
				if(x == 318 && y == 510) {
					Pm.setBounds(x, y, 54, s);
					Pm.setBackground(Color.LIGHT_GRAY);
					Pm.setToolTipText("Atomic Mass : 145, Atomic Number : 61");
					jf.add(Pm);
				}
				if(x == 378 && y == 510) {
					Sm.setBounds(x, y, 54, s);
					Sm.setBackground(Color.LIGHT_GRAY);
					Sm.setToolTipText("Atomic Mass : 150, Atomic Number : 62");
					jf.add(Sm);
				}
				if(x == 440 && y == 510) {
					Eu.setBounds(x, y, s, s);
					Eu.setBackground(Color.LIGHT_GRAY);
					Eu.setToolTipText("Atomic Mass : 152, Atomic Number : 63");
					jf.add(Eu);
				}
				if(x == 500 && y == 510) {
					Gd.setBounds(x-2, y, s+4, s);
					Gd.setBackground(Color.LIGHT_GRAY);
					Gd.setToolTipText("Atomic Mass : 157, Atomic Number : 64");
					jf.add(Gd);
				}
				if(x == 560 && y == 510) {
					Tb.setBounds(x, y, s, s);
					Tb.setBackground(Color.LIGHT_GRAY);
					Tb.setToolTipText("Atomic Mass : 159, Atomic Number : 65");
					jf.add(Tb);
				}
				if(x == 620 && y == 510) {
					Dy.setBounds(x, y, s, s);
					Dy.setBackground(Color.LIGHT_GRAY);
					Dy.setToolTipText("Atomic Mass : 162.5, Atomic Number : 66");
					jf.add(Dy);
				}
				if(x == 680 && y == 510) {
					Ho.setBounds(x, y, s, s);
					Ho.setBackground(Color.LIGHT_GRAY);
					Ho.setToolTipText("Atomic Mass : 165, Atomic Number : 67");
					jf.add(Ho);
				}
				if(x == 740 && y == 510) {
					Er.setBounds(x, y, s, s);
					Er.setBackground(Color.LIGHT_GRAY);
					Er.setToolTipText("Atomic Mass : 167, Atomic Number : 68");
					jf.add(Er);
				}
				if(x == 798 && y == 510) {
					Tm.setBounds(x, y, 54, s);
					Tm.setBackground(Color.LIGHT_GRAY);
					Tm.setToolTipText("Atomic Mass : 169, Atomic Number : 69");
					jf.add(Tm);
				}
				if(x == 860 && y == 510) {
					Yb.setBounds(x, y, s, s);
					Yb.setBackground(Color.LIGHT_GRAY);
					jf.add(Yb);
				}
				if(x == 920 && y == 510) {
					Lu.setBounds(x, y, s, s);
					Lu.setBackground(Color.LIGHT_GRAY);
					Lu.setToolTipText("Atomic Mass : 175, Atomic Number : 71");
					jf.add(Lu);
				}
				if(x == 140 && y == 570) {
					Th.setBounds(x, y, s, s);
					Th.setBackground(Color.GRAY);
					Th.setToolTipText("Atomic Mass : 232, Atomic Number : 90");
					jf.add(Th);
				}
				if(x == 200 && y == 570) {
					Pa.setBounds(x, y, s, s);
					Pa.setBackground(Color.GRAY);
					Pa.setToolTipText("Atomic Mass : 231, Atomic Number : 91");
					jf.add(Pa);
				}
				if(x == 260 && y == 570) {
					U.setBounds(x, y, s, s);
					U.setBackground(Color.GRAY);
					U.setToolTipText("Atomic Mass : 238, Atomic Number : 92");
					jf.add(U);
				}
				if(x == 320 && y == 570) {
					Np.setBounds(x, y, s, s);
					Np.setBackground(Color.GRAY);
					Np.setToolTipText("Atomic Mass : 237, Atomic Number : 93");
					jf.add(Np);
				}
				if(x == 380 && y == 570) {
					Pu.setBounds(x, y, s, s);
					Pu.setBackground(Color.GRAY);
					Pu.setToolTipText("Atomic Mass : 244, Atomic Number : 94");
					jf.add(Pu);
				}
				if(x == 438 && y == 570) {
					Am.setBounds(x, y, 54, s);
					Am.setBackground(Color.GRAY);
					Am.setToolTipText("Atomic Mass : 243, Atomic Number : 95");
					jf.add(Am);
				}
				if(x == 498 && y == 570) {
					Cm.setBounds(x, y, 54, s);
					Cm.setBackground(Color.GRAY);
					Cm.setToolTipText("Atomic Mass : 247, Atomic Number : 96");
					jf.add(Cm);
				}
				if(x == 560 && y == 570) {
					Bk.setBounds(x, y, s, s);
					Bk.setBackground(Color.GRAY);
					Bk.setToolTipText("Atomic Mass : 247, Atomic Number : 97");
					jf.add(Bk);
				}
				if(x == 620 && y == 570) {
					Cf.setBounds(x, y, s, s);
					Cf.setBackground(Color.GRAY);
					Cf.setToolTipText("Atomic Mass : 251, Atomic Number : 98");
					jf.add(Cf);
				}
				
				if(x == 680 && y == 570) {
					Es.setBounds(x, y, s, s);
					Es.setBackground(Color.GRAY);
					Es.setToolTipText("Atomic Mass : 252, Atomic Number : 99");
					jf.add(Es);
				}
				if(x == 738 && y == 570) {
					Fm.setBounds(x, y, 54, s);
					Fm.setBackground(Color.GRAY);
					Fm.setToolTipText("Atomic Mass : 257, Atomic Number : 100");
					jf.add(Fm);
				}
				if(x == 798 && y == 570) {
					Md.setBounds(x, y, 54, s);
					Md.setBackground(Color.GRAY);
					Md.setToolTipText("Atomic Mass : 258, Atomic Number : 101");
					jf.add(Md);
				}
				if(x == 860 && y == 570) {
					No.setBounds(x, y, s, s);
					No.setBackground(Color.GRAY);
					No.setToolTipText("Atomic Mass : 259, Atomic Number : 102");
					jf.add(No);
				}
				if(x == 920 && y == 570) {
					Lr.setBounds(x, y, s, s);
					Lr.setBackground(Color.GRAY);
					Lr.setToolTipText("Atomic Mass : 266, Atomic Number : 103");
					jf.add(Lr);
				}
			}
		}
		
		/////*****Button Event Listener*****///// cause why tf not
		handler h = new handler();
		about.addActionListener(h);
		Mol.addActionListener(h);
		Table.addActionListener(h);
		web.addActionListener(h);
		
		/////******Background image******//////
			
		/////******Some Final code*****//////
		jf.setSize(1130, 800);
		jf.setLayout(null);
		jf.setResizable(false);
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
		jf.setVisible(true);
		
	}
	
	private class handler implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == about) {
				JFrame ah = new JFrame("About & Help");
				JLabel info = new JLabel("<html>This Periodic Table app was developed by Jake Watson.<br></br> The app was made for personal and educational use. <br></br> If the bottom of app is under taskbar adjust scaling in settings. <br></br> If you find any issues please email. <br></br> Email: 15watsonj@courtfields.net <br></br> Verion 1.1.0</html>");
				
				web.setBounds(5, 100, 135, 25);
				info.setBounds(5,0,800, 100);
				
				ah.add(info);
				ah.add(web);
				
				ah.setSize(385, 165);
				ah.setLayout(null);
				ah.setResizable(false);
				ah.setVisible(true);

				//JOptionPane.showMessageDialog(null, "This Periodic Table app was developed by Jake Watson.\n The app was made for personal and educational use. \n \n If you find any issues please email. \n Email: 15watsonj@courtfields.net \n Verion 1.1.0", "About & Help", 3); 
			}
			if(e.getSource() == Mol) {
				//JOptionPane.showMessageDialog(null, "In development - Sorry", "Molar calculator", 0);
				@SuppressWarnings("unused")
				calc cl = new calc();
			}
			if(e.getSource() == Table) {
				JOptionPane.showMessageDialog(null, "This is the Periodic Table. \n It holds all known elements.\n - Some elements are not included.\n - Most Atomic Numbers & Weights are\n   based on averages and most stable\n   isotopes.", "Periodic Table", 1);
			}
			if(e.getSource() == web) {
				try {
					   Desktop.getDesktop().browse(new URL("https://github.com/Jake1402?tab=repositories").toURI());
					} catch (Exception e1) {
					     e1.printStackTrace();
					}
			}
		}
	}
}