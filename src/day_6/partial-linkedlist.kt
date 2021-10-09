package day_6

fun main() {
    var ll = LinkedList()
    ll.insertAtLast(5)
    ll.insertAtLast(4)
    ll.insertAtLast(3)
    ll.insertAtLast(2)
    ll.insertAtLast(1)
    ll.display()
}

class Node(var data: Int, var next: Node? = null)

class LinkedList {
    private var head: Node? = null
    private var tail: Node? = null

    fun insertAtLast(data: Int) {
        if (head == null) {
            head = Node(data)
            tail = head
        } else {
            val node = Node(data)
            tail?.next = node //safe call
            tail = node
        }
    }

    fun display() {
        var h = head
        while (h !== null) {
            println(h.data)
            h = h.next
        }
    }
}