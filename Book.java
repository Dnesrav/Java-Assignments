public class Book {

	String bookName;
	String author;
	int standard;
	
		public Book(){
			
		}
          public Book(String bookName, String author){
        	  this();
        	  this.bookName=bookName;
        	  this.author= author;
			
		}
          public Book(String name, String author, int standard){
        	
        	this(name, author);//new Book(name , author)
        	  /*bookName=name;
        	 this.author= author;*/
        	 this.standard=standard;
  		}
         /* public String toString() {
        	  return this.bookName+" "+this.author+" "+this.standard;
          }*/
          static public void main(String ar[]) {
        		Book bookObj=new Book("English","Dhinesh",10);
        		Book bookObj1=new Book("math","Dhin",10);
        		Book bookObj2=bookObj;
        		int std=bookObj.standard;
        		//String result=bookObj.toString();
        		System.out.println(bookObj);
        		System.out.print(bookObj2);
        	}
}

