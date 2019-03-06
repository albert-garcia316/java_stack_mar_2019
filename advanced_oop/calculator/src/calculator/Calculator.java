package calculator;

public class Calculator implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double operandOne;
	private double operandTwo;
	private String operation;
	private double results;
	
	public Calculator() {
		this.operandOne = 0.0;
		this.operandTwo = 0.0;
		this.operation = "";
		this.results = 0.0;
	}

	public double getOperandOne() {
		return operandOne;
	}

	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}

	public double getOperandTwo() {
		return operandTwo;
	}

	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public void getResults() {
		System.out.println(this.results);
		this.clear();
	}

	public void setResults(double results) {
		this.results = results;
	}
	public void performOperation() {
		String operation = this.getOperation();
		if(operation.equals("+")) {
			this.results = this.getOperandOne() + this.getOperandTwo();
			this.getResults();
		} 
		else if(operation.equals("-")) {
			this.results = this.getOperandOne() - this.getOperandTwo();
			this.getResults();
		}
		else if(operation.equals("*")) {
			this.results = this.getOperandOne() * this.getOperandTwo();
			this.getResults();
		}
		else if(operation.equals("/")) {
			this.results = this.getOperandOne() / this.getOperandTwo();
			this.getResults();
		}
		else {
			System.out.println("The operation entered is invalid, pease use +, -, *, or /");
		}

	}
	private void clear() {
		this.operandOne = 0.0;
		this.operandTwo = 0.0;
		this.operation = "";
		this.results = 0.0;
	}
	
}
