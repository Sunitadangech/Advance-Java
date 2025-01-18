package com.jspiders.demoapp;

public class DynamicArray {
		private int[] arr=new int[5];
		
		private int index=0;
		
		private int capacity=arr.length;
		
		public void add(int num) {
			if(index==capacity) {
				int[] temp=new int[2*capacity];
				for(int i=0;i<index;i++) {
					temp[i]=arr[i];
				}
				arr=temp;
			}
			arr[index]=num;
			index++;
		}
		
		public void delete() {
			arr[index-1]=0;
			index--;
		}
		
		///delete
		public void delete(int i) {
			if(i>=0 && i<index) {
				for(int j=i;j<index-1;j++) {
					arr[j]=arr[j+1];
				}
				index--;
			}else {
				System.out.println("Invalid index");
			}
			
		}
		 
		
		
		//Set
		public void set(int value,int i) {
			if(i>=0 && i<index) {
				arr[i]=value;
			}else {
				System.out.println("Invalid index");
			}
		}
		
		//Put
		public void put(int value,int i) {
			if(i>=0 && i<index) {
				for(int j=index-1;j>=i;j--) {
					arr[j+1]=arr[j];
				}
				arr[i]=value;
				index++;
			}else {
				System.out.println("Invalid index");
			}
		}
		
		public void print() {
			for(int i=0;i<index;i++) {
				System.out.println(arr[i]+"");
			}
			System.out.println();
		}

	}
	//
	//package com.dynamicarray;
	//
	//public class Test {
//	    public static void main(String[] args) {
//	        Demo d1 = new Demo(); // Create an instance of the Demo class
	//
//	        // Adding elements to the dynamic array
//	        d1.add(10);
//	        d1.add(20);
//	        d1.add(30);
//	        d1.add(40);
//	        d1.add(50);
//	        d1.add(60); // This will check whther array size increase 
//	        d1.add(70); 
	//
//	        System.out.println("Array after adding elements:");
//	        d1.print(); // Print the current elements
//	        
//	        
//	        System.out.println("==================");
	//
//	        // Testing deletion
//	        d1.deleteIndex(3); // Delete the element at index 3 (which is 40)
//	        System.out.println("Array after deleting element at index 3:");
//	        d1.print(); // Print the elements after deletion
	//
//	       System.out.println("Try deleting invalid index element");
//	        d1.deleteIndex(10); // Attempting to delete an invalid index
//	        
//	        System.out.println("Delting the last element");
//	        
//	        d1.deleteIndex();
//	        
//	        System.out.println();
//	        
//	        d1.print();
//	        
//	        
//	        d1.deleteIndex(100);
//	        d1.print();
//	        
//	        d1.set(90, 2);
//	        System.out.println("Set the element at desired index without replacemnt");
//	        d1.print();
//	        
//	        System.out.println("Put the element at desired element ");
//	        
//	        d1.put(100,4);
//	        d1.print();
//	        
//	    }
//      }
