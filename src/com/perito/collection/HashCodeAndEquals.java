package com.perito.collection;

public class HashCodeAndEquals {
	
	int id;
	String name;
	
	
	
	public HashCodeAndEquals(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		// if both the object references are  
	    // referring to the same object. 
	    if(this == obj) 
	            return true; 
	          
	        // it checks if the argument is of the  
	        // type Geek by comparing the classes  
	        // of the passed argument and this object. 
	        // if(!(obj instanceof Geek)) return false; ---> avoid. 
	        if(obj == null || obj.getClass()!= this.getClass()) 
	            return false; 
	          
	        // type casting of the argument.  
	        HashCodeAndEquals hashCodeAndEquals = (HashCodeAndEquals) obj; 
	          
	        // comparing the state of argument with  
	        // the state of 'this' Object. 
	        return (hashCodeAndEquals.name.equals(this.name)  && hashCodeAndEquals.id == this.id);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id;
	}
	
	


	public static void main(String[] args) {
		HashCodeAndEquals h1 = new HashCodeAndEquals(101, "Abc");
		HashCodeAndEquals h2 = new HashCodeAndEquals(101, "Abc");
		
		
		System.out.println(h1.equals(h2));
		
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
		
	}

}
