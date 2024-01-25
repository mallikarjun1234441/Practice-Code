package com.dl.Comparator;

public class Employeee {
	
		int id;
		String name;
		
		public Employeee() {
			}
		
		public Employeee(int id, String name) {
			this.id = id;
			this.name = name;
		}

		@Override
		public String toString() {
			return "Employeee [id=" + id + ", name=" + name + "]";
			
		}
		}


