package gyw_lab8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RecordList {

	private class Node {
		Record data;
		Node next;

		public Node(Record dataValue) {
			next = null;
			data = dataValue;
		}

	}

	private Node head;

	public RecordList() {
		head = new Node(null);
	}

	/**
	 * Finds the index of the record with the given name in the list
	 * @param name name to search for
	 * @return index of name in list if found, -1 otherwise
	 */
	public int indexOf(String name) {
		Node currentNode = head;
		int index = 0;

		// traverse through the list looking for our target node
		while (currentNode.next != null && !currentNode.next.data.getName().equals(name)) {
			currentNode = currentNode.next;
			index++;
		}

		// we got to the end of the list without finding our target
		if (currentNode.next == null) return -1;
		else return index;
	}

	/**
	 * Adds the given item to the list, sorted by time (lowest to highest)
	 * @param data data to add
	 * @return the index the data was inserted at
	 */
	public int add(Record data) {
		Node addNode = new Node(data);
		Node cNode = head;
		int index = 0;

		while (cNode.next != null && addNode.data.getTime() > cNode.next.data.getTime()) {
			cNode = cNode.next;
			index ++;
		}
		
		if(cNode.next == null) {
			cNode.next = addNode;
		}else {
			Node nex = cNode.next;
			addNode.next = nex;
			cNode.next = addNode;
			
		}
		return index;
	}

	/**
	 * Prints out each record in the list, one per line
	 */
	public void print() {
		// note that we start from our first *real* node in this case (head.next, not
		// our dummy head)
		Node currentNode = head.next;
		while (currentNode != null) {
			System.out.println(currentNode.data.getName() + ", " + currentNode.data.getTime());
			currentNode = currentNode.next;
		}
		System.out.println();
	}

	/**
	 * Write out the contents of the linked list to the given file, one entry per line
	 * @param filename name of the file to write the list to
	 */
	public void writeToFile(String filename) {
		String out = "";
		for(Node n = head.next;n != null; n = n.next) {
			out = out + n.data.getName() +"," + n.data.getTime() +"\n";
		}
		try {
		    FileWriter fw = new FileWriter(filename);
		    BufferedWriter bw = new BufferedWriter(fw);
		    bw.write(out);
		    bw.write("\n");
		    bw.close();
		    fw.close();
		} catch (IOException e) {
		            System.out.println(e.getMessage());
		}
		System.out.println(out);
    }
}
