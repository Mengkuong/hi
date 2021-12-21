import java.util.ArrayList;
import java.util.Scanner;

public class ManagePc {

	ArrayList<Pc> pcs = new ArrayList<>();
	
	public void add() {
		int[] idAdd = {1,2,3,4,5};
		String[] modelAdd = {"ASUS","DELL","ACER","MSI","MACBOOK"};
		int[] statusAdd = {1,1,0,0,1};
		
		for(int i=0; i<5; i++)
		{
			Pc pc = new Pc();
			
			pc.setId(idAdd[i]);
			pc.setModel(modelAdd[i]);
			pc.setStatus(statusAdd[i]);
			
			addNewProduct(pc);
		}
	}
	
	public void addNewProduct(Pc pc) {
		pcs.add(pc);
	}
	
	public void listAllPC() {
		System.out.printf("\tNo.	Model	Status\n"+
						  "\t------------------------\n");
		for(int i=0; i<pcs.size(); i++) {
			System.out.printf("\t"+pcs.get(i).getId()+"\t"+pcs.get(i).getModel()+"\t"+pcs.get(i).getStatus()+"\n");
		}
		System.out.printf("\n");
	}
	public void listAllDamagePC() {
		System.out.printf("\tNo.	Model	Status\n"+
						  "\t------------------------\n");
		for(int i=0; i<pcs.size(); i++) {
			if(pcs.get(i).getStatus()==1) {
				System.out.printf("\t"+pcs.get(i).getId()+"\t"+pcs.get(i).getModel()+"\t"+pcs.get(i).getStatus()+"\n");
			}
		}System.out.printf("\n");
		
	}
	public void listAllGoodPC() {
		System.out.printf("\tNo.	Model	Status\n"+
						  "\t------------------------\n");
		for(int i=0; i<pcs.size(); i++) {
			if(pcs.get(i).getStatus()==0) {
				System.out.printf("\t"+pcs.get(i).getId()+"\t"+pcs.get(i).getModel()+"\t"+pcs.get(i).getStatus()+"\n");
			}
		}System.out.printf("\n");
		
	}
	public void MarkPcDamage() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Input PC ID: ");
		int id = sc.nextInt();
		int index = -1;
		
		for(int i=0; i<pcs.size(); i++)
		{
			int id_find = pcs.get(i).getId();
			if(id == id_find) {
				index = i;
				break;
			}
		}
		if(index < 0 || index >= pcs.size()) {
			System.err.printf("ERROR: Index out of range.");
		}
		else {
			pcs.get(index).setStatus(1);
		}
	}
	public void MarkPcGood() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Input PC ID: ");
		int id = sc.nextInt();
		int index = -1;
		
		for(int i=0; i<pcs.size(); i++)
		{
			int id_find = pcs.get(i).getId();
			if(id == id_find) {
				index = i;
				break;
			}
		}
		if(index < 0 || index >= pcs.size()) {
			System.err.printf("ERROR: Index out of range.");
		}
		else {
			pcs.get(index).setStatus(0);
		}
	}
	public int menu() {

		  int opt;
		  Scanner sc = new Scanner(System.in);
		  do {
		      System.out.println("""
		                1. List all PCs
		                2. List all Damages PCs
		                3. List all Good PCs
		                4. Mark a PC as Damage
		                5. Mark a PC as Good
		                6. Quit
		                 Choose an option:
		                      """);
		      opt = Integer.parseInt(sc.nextLine());
		  } while (opt < 1 || opt > 5);

		  return opt;
		}
	
	public static void main(String[] args) {
		ManagePc mpc = new ManagePc();
		mpc.add();
		Scanner sc = new Scanner(System.in);
		int opt;
		do {
			opt = mpc.menu();
			switch(opt) {
			case 1:
				mpc.listAllPC();
				break;
			case 2:
				mpc.listAllDamagePC();
				break;
			case 3:
				mpc.listAllGoodPC();
				break;
			case 4:
				mpc.MarkPcDamage();
				break;
			case 5:
				mpc.MarkPcGood();
				break;
			case 6:
				System.out.println("Thank You!");
				break;
			}
		}while(opt != 6);

	}

}
