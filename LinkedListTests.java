package in.conceptarchitect.tests;

import static org.junit.Assert.assertEquals;
import in.conceptarchitect.collections.LinkedList;

import org.junit.Ignore;
import org.junit.Test;

public class LinkedListTests {

	@Test
	public void new_listIsEmpty() 
	{
		LinkedList<Integer> list=new LinkedList<>();
		assertEquals(0, list.size());
	}

	@Test
	public void toString_returnsListWithEmptyParenthesis() 
	{
		LinkedList<Integer> list=new LinkedList<Integer>();
		assertEquals("LinkedList()", list.toString());
	}
	
	@Test
	public void add_canAddToAnEmptyList() 
	{
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(5);
		assertEquals(1,list.size());
	}
	
	@Test
	public void add_addingToANonEmptyListAddsItemAtTheEnd() 
	{
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(2);
		assertEquals(1,list.size());
	}
	
	@Test
	public void add_addedItemsAreShownInToString() 
	{
		
		
	}
	@Ignore 
	@Test
	public void get_0GetsTheFirstItem() 
	{
		LinkedList<Integer> list=new LinkedList<Integer>();
		assertEquals(5,(int)list.get(0));
	}
	
	@Test
	public void get_PosReturnsItemsFromZeroBasedIndex() {
		
	}
	
	@Test
	public void get_throwsIndexExceptionForInvalidIndex() 
	{
		LinkedList<Integer> list=new LinkedList<Integer>();
		try
		{
			int val = list.get(5); //should throw IndexOutOfBoundsException
		}
		catch(IndexOutOfBoundsException ex)
		{
			ex.getStackTrace();
		}
	}
	
	@Test
	public void get_NegativeIndexIsACirclularIndex() {
		//-1 is last item
		//-2 is second last item
		//-3 is third last item
		//size() is first item
		
		//you will have to modify LinkedList to implement this feature
	}
	
	@Test
	public void set_setDoesntAddNewItem() 
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		try
		{
			list.set(0, 3);
		}
		catch(Exception e)
		{
			System.out.println("Set Does not add new Item ");
		}
		
	}
	
	LinkedList<Integer> list = new LinkedList<Integer>();
	@Test
	public void set_replacesCurrentItem() 
	{
		list.add(5);
		list.set(0, 3);
		assertEquals(1,list.size());
	}
	
	@Test
	public void set_failsForInvalidIndex() 
	{
		list.add(6);
		try
		{
			list.set(5, 5);
		}
		catch(Exception e)
		{
			System.out.println("Set Fails for invalid index ");
		}
		
	}
	
	@Test
	public void remove_removesTheItemFromValidIndex() 
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.remove(1);
		assertEquals(2,list.size());
	}
	
	@Ignore 
	@Test
	public void remove_usesCircularIndex() 
	{
		
	}
	
	@Ignore 
	@Test
	public void get_removeReturnsTheRemovedItem() 
	{
		
	}
}
