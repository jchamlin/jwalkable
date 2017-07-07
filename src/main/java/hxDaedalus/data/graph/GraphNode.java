// Generated by Haxe 3.4.2
package hxDaedalus.data.graph;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class GraphNode extends haxe.lang.HxObject
{
	static
	{
		//line 17 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		hxDaedalus.data.graph.GraphNode.INC = 0;
	}
	
	public GraphNode(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public GraphNode()
	{
		//line 28 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		hxDaedalus.data.graph.GraphNode.__hx_ctor_hxDaedalus_data_graph_GraphNode(this);
	}
	
	
	public static void __hx_ctor_hxDaedalus_data_graph_GraphNode(hxDaedalus.data.graph.GraphNode __hx_this)
	{
		//line 30 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		__hx_this._id = hxDaedalus.data.graph.GraphNode.INC;
		//line 31 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		hxDaedalus.data.graph.GraphNode.INC++;
		//line 33 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		__hx_this._successorNodes = new haxe.ds.ObjectMap<hxDaedalus.data.graph.GraphNode, hxDaedalus.data.graph.GraphEdge>();
	}
	
	
	public static int INC;
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int _id;
	
	public hxDaedalus.data.graph.GraphNode _prev;
	
	public hxDaedalus.data.graph.GraphNode _next;
	
	public hxDaedalus.data.graph.GraphEdge _outgoingEdge;
	
	public haxe.ds.ObjectMap<hxDaedalus.data.graph.GraphNode, hxDaedalus.data.graph.GraphEdge> _successorNodes;
	
	public hxDaedalus.data.math.NodeData _data;
	
	public int get_id()
	{
		//line 37 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		return this._id;
	}
	
	
	public void dispose()
	{
		//line 42 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		this._prev = null;
		//line 43 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		this._next = null;
		//line 44 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		this._outgoingEdge = null;
		//line 45 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		this._successorNodes = null;
		//line 46 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		this._data = null;
	}
	
	
	public hxDaedalus.data.graph.GraphNode get_prev()
	{
		//line 51 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		return this._prev;
	}
	
	
	public hxDaedalus.data.graph.GraphNode set_prev(hxDaedalus.data.graph.GraphNode value)
	{
		//line 56 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		this._prev = value;
		//line 57 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		return value;
	}
	
	
	public hxDaedalus.data.graph.GraphNode get_next()
	{
		//line 62 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		return this._next;
	}
	
	
	public hxDaedalus.data.graph.GraphNode set_next(hxDaedalus.data.graph.GraphNode value)
	{
		//line 67 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		this._next = value;
		//line 68 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		return value;
	}
	
	
	public hxDaedalus.data.graph.GraphEdge get_outgoingEdge()
	{
		//line 73 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		return this._outgoingEdge;
	}
	
	
	public hxDaedalus.data.graph.GraphEdge set_outgoingEdge(hxDaedalus.data.graph.GraphEdge value)
	{
		//line 78 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		this._outgoingEdge = value;
		//line 79 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		return value;
	}
	
	
	public haxe.ds.ObjectMap<hxDaedalus.data.graph.GraphNode, hxDaedalus.data.graph.GraphEdge> get_successorNodes()
	{
		//line 84 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		return this._successorNodes;
	}
	
	
	public haxe.ds.ObjectMap<hxDaedalus.data.graph.GraphNode, hxDaedalus.data.graph.GraphEdge> set_successorNodes(haxe.ds.ObjectMap<hxDaedalus.data.graph.GraphNode, hxDaedalus.data.graph.GraphEdge> value)
	{
		//line 89 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		this._successorNodes = value;
		//line 90 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		return value;
	}
	
	
	public hxDaedalus.data.math.NodeData get_data()
	{
		//line 97 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		return this._data;
	}
	
	
	public hxDaedalus.data.math.NodeData set_data(hxDaedalus.data.math.NodeData value)
	{
		//line 102 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		this._data = value;
		//line 103 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		return value;
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		{
			//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
			switch (field.hashCode())
			{
				case 94650:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("_id")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						this._id = ((int) (value) );
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return value;
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
			}
			
			//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		{
			//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
			switch (field.hashCode())
			{
				case 90810505:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("_data")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						this._data = ((hxDaedalus.data.math.NodeData) (value) );
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return value;
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case 3449395:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("prev")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						this.set_prev(((hxDaedalus.data.graph.GraphNode) (value) ));
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return value;
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case -1144127670:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("_successorNodes")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						this._successorNodes = ((haxe.ds.ObjectMap<hxDaedalus.data.graph.GraphNode, hxDaedalus.data.graph.GraphEdge>) (value) );
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return value;
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case 3377907:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("next")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						this.set_next(((hxDaedalus.data.graph.GraphNode) (value) ));
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return value;
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case -1131550424:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("_outgoingEdge")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						this._outgoingEdge = ((hxDaedalus.data.graph.GraphEdge) (value) );
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return value;
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case 971931465:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("outgoingEdge")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						this.set_outgoingEdge(((hxDaedalus.data.graph.GraphEdge) (value) ));
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return value;
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case 91112402:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("_next")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						this._next = ((hxDaedalus.data.graph.GraphNode) (value) );
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return value;
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case 1667338539:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("successorNodes")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						this.set_successorNodes(((haxe.ds.ObjectMap<hxDaedalus.data.graph.GraphNode, hxDaedalus.data.graph.GraphEdge>) (value) ));
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return value;
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case 91183890:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("_prev")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						this._prev = ((hxDaedalus.data.graph.GraphNode) (value) );
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return value;
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case 3076010:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("data")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						this.set_data(((hxDaedalus.data.math.NodeData) (value) ));
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return value;
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case 94650:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("_id")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						this._id = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return value;
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
			}
			
			//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		{
			//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
			switch (field.hashCode())
			{
				case 1415076199:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("set_data")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_data")) );
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case 3355:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("id")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return this.get_id();
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case 1976188659:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("get_data")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_data")) );
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case 3449395:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("prev")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return this.get_prev();
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case 309572264:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("set_successorNodes")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_successorNodes")) );
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case 3377907:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("next")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return this.get_next();
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case -610461388:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("get_successorNodes")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_successorNodes")) );
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case 971931465:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("outgoingEdge")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return this.get_outgoingEdge();
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case -584786938:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("set_outgoingEdge")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_outgoingEdge")) );
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case 1667338539:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("successorNodes")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return this.get_successorNodes();
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case 1246655890:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("get_outgoingEdge")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_outgoingEdge")) );
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case 3076010:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("data")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return this.get_data();
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case 1415378096:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("set_next")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_next")) );
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case 94650:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("_id")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return this._id;
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case 1976490556:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("get_next")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_next")) );
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case 91183890:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("_prev")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return this._prev;
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case 1415449584:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("set_prev")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_prev")) );
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case 91112402:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("_next")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return this._next;
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case 1976562044:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("get_prev")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_prev")) );
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case -1131550424:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("_outgoingEdge")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return this._outgoingEdge;
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case 1671767583:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("dispose")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "dispose")) );
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case -1144127670:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("_successorNodes")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return this._successorNodes;
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case -1249338716:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("get_id")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_id")) );
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case 90810505:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("_data")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return this._data;
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
			}
			
			//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		{
			//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
			switch (field.hashCode())
			{
				case 94650:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("_id")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return ((double) (this._id) );
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case 3355:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("id")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return ((double) (this.get_id()) );
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
			}
			
			//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		{
			//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
			switch (field.hashCode())
			{
				case 1415076199:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("set_data")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return this.set_data(((hxDaedalus.data.math.NodeData) (dynargs.__get(0)) ));
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case -1249338716:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("get_id")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return this.get_id();
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case 1976188659:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("get_data")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return this.get_data();
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case 1671767583:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("dispose")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						this.dispose();
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case 309572264:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("set_successorNodes")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return this.set_successorNodes(((haxe.ds.ObjectMap<hxDaedalus.data.graph.GraphNode, hxDaedalus.data.graph.GraphEdge>) (dynargs.__get(0)) ));
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case 1976562044:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("get_prev")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return this.get_prev();
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case -610461388:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("get_successorNodes")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return this.get_successorNodes();
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case 1415449584:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("set_prev")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return this.set_prev(((hxDaedalus.data.graph.GraphNode) (dynargs.__get(0)) ));
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case -584786938:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("set_outgoingEdge")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return this.set_outgoingEdge(((hxDaedalus.data.graph.GraphEdge) (dynargs.__get(0)) ));
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case 1976490556:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("get_next")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return this.get_next();
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case 1246655890:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("get_outgoingEdge")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return this.get_outgoingEdge();
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
				case 1415378096:
				{
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					if (field.equals("set_next")) 
					{
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						__temp_executeDef1 = false;
						//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
						return this.set_next(((hxDaedalus.data.graph.GraphNode) (dynargs.__get(0)) ));
					}
					
					//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
					break;
				}
				
				
			}
			
			//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		baseArr.push("_data");
		//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		baseArr.push("_successorNodes");
		//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		baseArr.push("_outgoingEdge");
		//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		baseArr.push("_next");
		//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		baseArr.push("_prev");
		//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		baseArr.push("_id");
		//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		baseArr.push("data");
		//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		baseArr.push("successorNodes");
		//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		baseArr.push("outgoingEdge");
		//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		baseArr.push("next");
		//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		baseArr.push("prev");
		//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		baseArr.push("id");
		//line 7 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/graph/GraphNode.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


