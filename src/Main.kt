fun main() {
  val head1 = ListNode(1)
  val body1 = ListNode(2)
  val body2 = ListNode(3)
  val body3 = ListNode(4)

  val head2 = ListNode(1)


  head1.next = body1
  body1.next = body3
  body3.next = null

  head2.next = body2
  body2.next = body3
  mergeTwoLists(head1, head2)

}

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {

  if (list1 == null && list2 == null) return null
  if (list1 == null) return list2
  if (list2 == null) return list1

  if (list1.`val` < list2.`val`) {
    list1.next = mergeTwoLists(list1.next, list2)
    return list1
  }
  list2.next = mergeTwoLists(list2.next, list1)
  return list2
}


class ListNode(var `val`: Int) {
  var next: ListNode? = null
}