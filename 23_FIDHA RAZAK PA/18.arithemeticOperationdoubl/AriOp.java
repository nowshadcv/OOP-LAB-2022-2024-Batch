package arithemeticOperationdoubl;

class AriOp implements AO {
	public int num1,num2;
	public AriOp(int n1,int n2){
		num1=n1;
		num2=n2;
		public int add(){
			return (num1+num2);
			}
		
		public int mult(){
			return(num1*num2);
			}
			
		public int sub(){
			return (num1-num2);
			}
			
		public double div(){
			return(num1/num2);
			}
	

}
}
