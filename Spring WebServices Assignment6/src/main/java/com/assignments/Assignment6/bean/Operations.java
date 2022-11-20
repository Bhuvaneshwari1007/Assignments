package com.assignments.Assignment6.bean;

	public class Operations {
		private String operation;
		private int a;
		private int b;

		public Operations() {
			super();
		}

		public Operations(String operation, int a, int b) {
			super();
			this.operation = operation;
			this.a = a;
			this.b = b;
		}

		public String getOperation() {
			return operation;
		}

		public void setOperation(String operation) {
			this.operation = operation;
		}

		public int getA() {
			return a;
		}

		public void setA(int a) {
			this.a = a;
		}

		public int getB() {
			return b;
		}

		public void setB(int b) {
			this.b = b;
		}

	}

