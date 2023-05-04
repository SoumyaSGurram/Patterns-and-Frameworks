package Question26;

import java.io.Serializable;

public class question26 implements Serializable{

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    private static final long serialVersionUID = 1L;
		    private static question26 instance;
		    
		    private question26() {
		        // private constructor
		    }
		    
		    public static question26 getInstance() {
		        if (instance == null) {
		            instance = new question26();
		        }
		        return instance;
		    }
		    
		    @Override
		    protected Object clone() throws CloneNotSupportedException {
		        throw new CloneNotSupportedException();
		    }
		    
		    protected Object readResolve() {
		        return instance;
		    }
		

	}


