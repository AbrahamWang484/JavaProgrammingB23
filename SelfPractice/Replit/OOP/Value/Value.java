package Replit.OOP.Value;

public class Value {
    private int val;
    private boolean modified;

    public Value() {
    }

    public Value(int val) {
        this.val = val;
        modified=false;
    }

    public int getVal() {
        return val;
    }

    public boolean wasModified() {
        return modified;
    }

    public void setVal(int val) {
        if (this.val != val){
            this.val=val;
            modified=true;
        }
    }
}
/*
The `Value` class has the following:

Instance variables (private) :
 - `val` as int
- `modified` as boolean

Constructors:

- a constructor with no parameters (empty)
- a constructor accepting a single int parameter to initialize `val`

Methods :
- a getter method for instance variable val - name it getVal
- a getter method for instance variable modified - name it `wasModified`
- a setter method for instance variable val - name it setVal
  > Using this method will set the given value to the Val variable and also change the modifed boolean to true

  Note: If the given value is the same as the existing Val value then no change is made
 */