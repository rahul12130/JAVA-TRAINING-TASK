class Emp_controlstatement{
	int id;
	String name;

	public A(int i, String n){

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
class empdata {
	
		public static void main(String[] args) {
			Emp_controlstatemen obj = new A(1,"HR");
			obj.Display();
			obj.show();}}}
		
