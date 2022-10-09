class Emp_controlstatements{
	int id;
	String name;

	public Emp_controlstatements(int i, String n){

		this.id = id;
		this.name= n;
	}
	

		void Display() {
			if(name=="HR") {
				System.out.println("HR");
			}
			else {
				System.out.println("not HR");
		}
}



void show() {
	switch(name) {
		case "HR" : System.out.println("HR");
		break;
			case "Not HR" : System.out.println("Not HR");
		break;
			default  : System.out.println("NA");
		break;
		}
	
}
class Emp_controlstatement {
	
		public static void main(String[] args) {
			Emp_controlstatements obj = new Emp_controlstatements(1,"HR");
			obj.Display();
			obj.show();}}}
		
