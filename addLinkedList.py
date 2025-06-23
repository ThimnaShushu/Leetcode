class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = nextclass 
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        num1 = ""
        num2 = ""
        while l1:
            num1 = str(i)+num1
            l1=l1.next
            
        while l2:
            num2 = str(i)+num2
            l2=l2.next
        
        num3 = int(num1)+ int(num2)
        num3 = str(num3)
        
        dummy = ListNode(0)
        current = dummy
        
        l3=[]
        for i in reversed(num3):
            current.next = ListNode(int(i))
            current = current.next
            
        return dummy.next
    
print(addTwoNumbers())

        