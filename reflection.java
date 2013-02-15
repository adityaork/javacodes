import java.lang.reflect.*;
public class reflection {
		public static void main(String[] args){
				String classname = args[0];
				try {
					//for(Class c:cls) System.out.println(c.getName());
					printclass(classname,"");
					
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
				
				
		}
		public static void printclass(String classname,String tab) {
			int i,j,limit;
			Class cl,scl;
			Class[] clss;
			try {
				cl = Class.forName(classname);
				scl=cl.getSuperclass();
				clss=cl.getDeclaredClasses();
			    System.out.print(tab+Modifier.toString(cl.getModifiers())+" class "+cl.getName());
			    if(scl != null && scl != Object.class) System.out.print(" extends "+scl.getName());
			    Class[] itypes = cl.getInterfaces();
			    limit = itypes.length;
			    if(limit >0) System.out.print(" implements ");
			    for(j=0;j<limit;j++) {
			    	if(j>0) System.out.print(", ");
			    	System.out.print(itypes[j].getName());
			    }
			    System.out.println("");
			    System.out.println(tab+"{");
			    //System.out.println("\n"+tab+tabstop+"//Constructors");
			    Constructor[] cs = cl.getDeclaredConstructors();
			    if(cs.length > 0) System.out.println("");
			    for(Constructor c:cs) {
			    	System.out.print(tab+tabstop+Modifier.toString(c.getModifiers())+" "+c.getName()+"(");
			    	Class[] ptypes = c.getParameterTypes();
			    	limit = ptypes.length;
			    	for(j=0;j<limit;j++) {
			    		if(j>0) System.out.print(", ");
			    		System.out.print(ptypes[j].getName());
			    	}
			    	System.out.println(");");
			    }
			    //System.out.println("\n"+tab+tabstop+"//Methods");
			    Method[] ms = cl.getDeclaredMethods();
			    if(ms.length > 0) System.out.println("");
			    for(Method m:ms) {
			    	System.out.print(tab+tabstop+Modifier.toString(m.getModifiers())+" "+m.getReturnType().getName()+" "+m.getName()+"(");
			    	Class[] ptypes = m.getParameterTypes();
			    	limit = ptypes.length;
			    	for(j=0;j<limit;j++) {
			    		if(j>0) System.out.print(", ");
			    		System.out.print(ptypes[j].getName());
			    	}
			    	System.out.print(")");
			    	Class[] etypes = m.getExceptionTypes();
			    	limit = etypes.length;
			    	if(limit > 0) System.out.print(" throws ");
			    	for(j=0;j<limit;j++) {
			    		if(j>0) System.out.print(", ");
			    		System.out.print(etypes[j].getName());
			    	}
			    	System.out.println(";");
			    }
			    //System.out.println("\n"+tab+tabstop+"//Fields");
			    Field[] fs = cl.getDeclaredFields();
			    if(fs.length > 0) System.out.println("");
			    for(Field f:fs) {
			    	System.out.println(tab+tabstop+Modifier.toString(f.getModifiers())+" "+f.getType().getName()+" "+f.getName()+";");
			    }
			    System.out.println("");
			    //System.out.println("\n"+tab+tabstop+"//Inner Classes");
			    for(Class cls:clss) printclass(cls.getName(),tab+tabstop);
			    System.out.println(tab+"}");
			    if(tab!="") System.out.println("");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		private static final String tabstop = "  ";
}