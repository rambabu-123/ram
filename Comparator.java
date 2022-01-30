package ram;


	public class Comparator implements Comparable<Object> {
		private static String Comparatorname1 = (String) null;
		private String Comparatorname;
		private int rollno;
		private int Comparatorage;
		

		public void Comparatort(int rollno, String Comparatortname, int Comparatorage) {
		this.rollno = rollno;
		this.Comparatorname = Comparatorname1;
		this.Comparatorage = Comparatorage;
		}


		/*public class Student {
		private String studentname;
		private int rollno;
		private int studentage;

		public Student(int rollno, String studentname, int studentage) {
		this.rollno = rollno;
		this.studentname = studentname;
		this.studentage = studentage;
		}*/

		public String getComparatorname1() {
		return Comparatorname1;
		}
		public void setComparatortname(String Comparatorname) {
		Comparator.Comparatorname1 = Comparatorname;
		}
		public int getRollno() {
		return rollno;
		}
		public void setRollno(int rollno) {
		this.rollno = rollno;
		}
		public int getComparatorage() {
		return Comparatorage;
		}
		//public void setComparatorage

		/*public class Student {
		private String studentname;
		private int rollno;
		private int studentage;

		public Student(int rollno, String studentname, int studentage) {
		this.rollno = rollno;
		this.studentname = studentname;
		this.studentage = studentage;
		}*/

		public String getComparatorname() {
		return Comparatorname;
		}
		public void setComparatorname(String Comparatorname) {
		Comparator.Comparatorname1 = Comparatorname;
		}
		public int getComparatorRollno() {
		return rollno;
		}
		public void setComparatorRollno(int rollno) {
		this.rollno = rollno;
		}
		public int getSComparatorage() {
		return Comparatorage;
		}
		
		public void setComparatorage1(int age, int Comparatorage) {
		this.Comparatorage = Comparatorage;
		}

		public int compareTo(Object comparestu) {
		int compareage=((Comparator)comparestu).getComparatorage();
		/* For Ascending order*/
		// return this.studentage-compareage;

		/* For Descending order do like this */
		return compareage-this.Comparatorage;
		}

		@Override
		public String toString() {
		return "[ rollno=" + rollno + ", name=" + Comparatorname + ", age=" + Comparatorage + "]";
		}
		}



