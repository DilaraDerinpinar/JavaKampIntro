package bank;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//V�DEO INHERITANCE DEMO,39
		
		KrediManagement krediManagement=new KrediManagement();
		BaseKrediManager esnafKredi=new EsnafKrediManager();
		BaseKrediManager tarimKredi=new TarimKrediManager();
		
		krediManagement.Add(esnafKredi);
		krediManagement.Add(tarimKredi);
		
	}

}
