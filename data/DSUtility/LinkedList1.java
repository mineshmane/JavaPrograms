package DSUtility;

public class LinkedList1 <T>{
	
	

    private Node<T> head;
    private int nodeCount;

    /// <summary>
    /// Initializes a new instance of the see LinkedList1{T}" class.
    /// To initialize to head=null and node count=0
    /// </summary>
    public LinkedList1()
    {
        this.head = null;
        this.nodeCount = 0;
    }

    /// <summary>
    /// Gets the first node from linked list.
    /// </summary>
    /// <returns> returns first node of list</returns>
    public Node<T> GetFirstNode()
    {
        return this.head;
    }

    /// <summary>
    /// Gets the last node from linked list.
    /// </summary>
    /// <returns> returns the last node</returns>
    public Node<T> GetLastNode()
    {
        Node<T> currentNode = this.head;
        while (currentNode.GetNext() != null)
        {
            currentNode = currentNode.GetNext();
        }
        return currentNode;
    }

    /// <summary>
    /// Determines whether this instance is empty.
    /// </summary>
    /// <returns>
    ///  true if this instance is empty; otherwise, false
    /// </returns>
    public boolean IsEmpty()
    {
        return this.head == null;
    }

    /// <summary>
    /// Adds the node at last of linked list.
    /// </summary>
    /// <param name="data">The data.@param
    public void AddNodeAtLast(T data)
    {
        if (this.IsEmpty())
        {
            this.head = new Node<T>(data, null, null);
            this.nodeCount++;
        }
        else
        {
            Node<T> currentNode = this.head;
            Node<T> newNode = new Node<T>(data, null);
            while (currentNode.GetNext() != null)
            {
                currentNode = currentNode.GetNext();
            }
            currentNode.SetNext(newNode);
            this.nodeCount++;
        }
    }

    /// <summary>
    /// Adds the node at first position of liked list.
    /// </summary>
    /// <param name="data">The data.@param
    public void AddNodeAtFirst(T data)
    {
        if (this.IsEmpty())
        {
            this.head = new Node<T>(data, null);
        }
        else
        {
            Node<T> newNode = new Node<T>(data, null);
            newNode.SetNext(this.head);
            this.head = newNode;
        }
    }

    /// <summary>
    /// Pushes the specified data at first position.
    /// </summary>
    /// <param name="data">The data.@param
    public void Push(T data)
    {
        this.AddNodeAtFirst(data);
    }

    /// <summary>
    /// Pops this instance at first position from linked list.
    /// </summary>
    /// <returns></returns>
    public boolean Pop()
    {
        return this.DeleteFirst();
    }

    /// <summary>
    /// Deletes the first node from linked list.
    /// </summary>
    /// <returns></returns>
    public boolean DeleteFirst()
    {
        if (this.IsEmpty())
        {
            System.out.println("Linked list is already empty");
            return false;
        }
        else if (this.head.GetNext() == null)
        {
            this.head = null;
            return true;
        }
        else
        {
            Node<T> currentNode = this.head;
            head = currentNode.GetNext();
           // GC.Collect();
            return true;
        }
    }

    /// <summary>
    /// Deletes the last node from linked list.
    /// </summary>
    public void DeleteLast()
    {
        if (this.IsEmpty())
        {
           System.out.println("Linked list is already empty");
            return;
        }
        else if (this.head.GetNext() == null)
        {
            this.head = null;
            return;
        }
        else
        {
            Node<T> currentNode = this.head;
            while (currentNode.GetNext().GetNext() != null)
            {
                currentNode = currentNode.GetNext();
            }
            currentNode.SetNext(null);
            return;
        }
    }

    /// <summary>
    /// Deletes node at specific position from linked list.
    /// </summary>
    /// <param name="data">The data.@param
    public void DeleteAtPosition(T data)
    {
        Node<T> currentNode = this.head;
        while (currentNode != null)
        {
            if (this.IsEmpty())
            {
             System.out.println("Linked list is already empty");
                return;
            }
            else if (currentNode == head && currentNode.GetData().equals(data))
            {
                this.DeleteFirst();
                //GC.Collect();
            }
            else if (currentNode.GetNext().GetData().equals(data))
            {
                currentNode.SetNext(currentNode.GetNext().GetNext());
               // GC.Collect();
                break;
            }
            else
            {
                currentNode = currentNode.GetNext();
            }

        }
    }

    /// <summary>
    /// Prints the linked list.
    /// </summary>
    public void Print()
    {
        if (this.IsEmpty())
        {
       System.out.println("Linked list is empty");
        }
        else
        {
            Node<T> currenrNode = this.head;
            while (currenrNode != null)
            {
              System.out.println(currenrNode.GetData() + "");
                currenrNode = currenrNode.GetNext();
            }
            System.out.println();
        }
    }

    /// <summary>
    /// Determines whether this data or word is contains in linked list or not.
    /// </summary>
    /// <param name="word">The word.@param
    /// <returns>
    ///   <c>true</c> if [contains] [the specified word]; otherwise, <c>false</c>.
    /// </returns>

    public boolean Contains(T word)
    {
        try
        {
            
            Node<T> currentNode = head;
            while (currentNode != null)
            {
                if (currentNode.GetData().equals(word))
                {
                    return true;
                }
                currentNode = currentNode.GetNext();
            }

            return false;
        }
        catch (Exception ex)
        {
           ex.printStackTrace();
        }
		return false;

    }

    /// <summary>
    /// Writes text to file.
    /// </summary>
    /// <returns></returns>
    public String WriteToFile()
    {
        String string1 = null;
        Node<T> temp = this.head;
        while (temp != null)
        {
            string1 += (temp.GetData() + "\n");
            temp = temp.GetNext();
        }

        return string1;
    }


}
