public class List {
	public Link first;
	public Link newLink;
	public int New = 0;

	public void add(int data) {
		newLink = new Link(data);
		newLink.next = first;
		first = newLink;
	}

	public void addComapre(int data) {
		newLink = new Link(data);
		newLink.next = first;
		first = newLink;
		compareAdd();
	}

	public void compareAdd() {
		if (first == null) {
			first = newLink;
		} else {
			if (newLink.Data > first.Data) {
				New = first.Data;
				first.Data = newLink.Data;
				newLink.Data = New;
				New = 0;
				first = newLink;
			} else {
				first = newLink;
			}
		}
		compareAuto();
	}

	public void compareAuto() {
		Link temp = first.next;
		Link prev = first;

		while (temp != null) {
			if (prev.Data > temp.Data) {
				New = temp.Data;
				temp.Data = prev.Data;
				prev.Data = New;
				New = 0;
			}
			prev = temp;
			temp = temp.next;
		}
		printStack();
	}

	public void printStack() {
		Link temp = first;
		while (temp != null) {
			temp.printData();
			temp = temp.next;
		}
		System.out.println();
	}

	public void findData(int data) {
		Link temp = first;
		while (temp != null) {
			if (temp.Data == data) {
				System.out.println("found: " + temp.Data);
			}
			temp = temp.next;
		}
	}

	public void DelIndex(int data) {
		Link p = first;
		Link f = first.next;
		while (f != null) {
			if (f.Data == data) {
				p.next = f.next;
				p = f.next;
			} else if (p.Data == data) {
				
			}
			p = f;
			f = f.next;
		}
		printStack();
	}

	public static void main(String[] args) {
		List test1 = new List();
		test1.add(1);
		test1.add(2);
		test1.add(3);
		test1.add(4);
		test1.printStack();
		test1.DelIndex(1);

		System.out.println("----1----");

		List test2 = new List();
		test2.add(2);
		test2.add(1);
		test2.add(3);
		test2.add(4);
		test2.printStack();
		test2.DelIndex(1);

		System.out.println("----2----");

		List test3 = new List();
		test3.add(2);
		test3.add(3);
		test3.add(1);
		test3.add(4);
		test3.printStack();
		test3.DelIndex(1);

		System.out.println("----3----");

		List test4 = new List();
		test4.add(2);
		test4.add(3);
		test4.add(4);
		test4.add(1);
		test4.printStack();
		test4.DelIndex(1);

		System.out.println("----4----");

	}
}