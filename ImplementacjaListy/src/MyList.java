import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MyList implements List<Object>{

	private Object[] thing;
	private int size;
		
	@Override
	public boolean add(Object e) {
		if(size!=0){
			int oldSize = size;
	        size++;
	        Object[] oldArr = thing;
	        thing = new Object[size];
	        thing[oldSize] = e;
	        System.arraycopy(oldArr, 0, thing, 0, oldSize);
		}
		else{
			size++;
			thing = new Object[1];
	        thing[0] = e; 	
		} 
        return true;	
	}
	@Test public void testAdd()
	   {
		assertEquals("Multiplication", 4, 2*2);
		assertEquals("Multiplication", 5, 2*2);
	   }
	@Override
	public void add(int index, Object element) {
		if(size!=0){
			size++;
			Object[] oldArr = thing;
	        thing = new Object[size];
			System.arraycopy(oldArr, 0, thing, 0, index);
			thing[index] = element;
			System.arraycopy(oldArr,index, thing,index+1,size-(index+1));   
		}
		else {
			size++;
			thing = new Object[1];
	        thing[0] = element;       
		}
		
	}

	@Override
	public void clear() {
		size = 0;
        thing=new Object[size]; 
	}

	@Override
	public boolean contains(Object o) {	
		for (Object thing1 : thing) 
        {
            if (thing1.equals(o)) 
            {
                return true;
            }
        }    
        return false;	
	}
	
	@Override
	public Object get(int index) {
		if(index>=size || size==0) return "Z³y index";
			return thing[index];
	}

	@Override
	public boolean remove(Object o) {
		for(int i=0; i<size; i++)
        {
            if(thing[i].equals(o))
            {
                remove(i);
                i--;
            }
        }
        return true;
	}

	@Override
	public Object remove(int index)  
{
		if(index>=size || size==0) return false;
		else{
	        Object[] oldArr = thing;
	        size--;
	        thing = new Object[size];   
	        System.arraycopy(oldArr, 0, thing, 0, index);
	        System.arraycopy(oldArr,index+1, thing,index,size-(index)); 
	        return true;
		}
    }

	@Override
	public int size() {
		return size;
	}

	
	@Override
	public boolean addAll(Collection<? extends Object> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends Object> c) {
		
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int indexOf(Object o) {
		for(int i=0; i<size; i++)
        {
            if(thing[i].equals(o))
            {
                return i;
            }
        }
		return -1;
	}

	@Override
	public boolean isEmpty() {
		if(size!=0) return true;
		return false;
	}

	@Override
	public Iterator<Object> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object o) {
		for(int i=size-1; i>=0; i--)
        {
            if(thing[i].equals(o))
            {
                return i;
            }
        }
		return -1;
	}

	@Override
	public ListIterator<Object> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<Object> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object set(int index, Object element) {
		if(index>=size || size==0) return "Z³y index";
		else{
			Object test=thing[index];
			thing[index]=element;
			return test;
		}
		
	}

	@Override
	public List<Object> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}
	public String toString(){
		String napis="";
		if(size!=0){
			for (Object thing1 : thing) 
				napis+=thing1+" ";	
		}
		else napis="Lista jest pusta";
		return napis;
		
	}
	public static void main(String[] args) {
		MyList nowa=new MyList();
		nowa.add("chuj");
		
	}

	

}
