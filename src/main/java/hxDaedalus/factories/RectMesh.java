// Generated by Haxe 3.4.2
package hxDaedalus.factories;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class RectMesh extends haxe.lang.HxObject
{
	public RectMesh(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public RectMesh()
	{
		//line 135 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		hxDaedalus.factories.RectMesh.__hx_ctor_hxDaedalus_factories_RectMesh(this);
	}
	
	
	public static void __hx_ctor_hxDaedalus_factories_RectMesh(hxDaedalus.factories.RectMesh __hx_this)
	{
	}
	
	
	public static hxDaedalus.data.Mesh buildRectangle(double width, double height)
	{
		//line 31 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		hxDaedalus.data.Vertex vTL = new hxDaedalus.data.Vertex();
		//line 32 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		hxDaedalus.data.Vertex vTR = new hxDaedalus.data.Vertex();
		//line 33 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		hxDaedalus.data.Vertex vBR = new hxDaedalus.data.Vertex();
		//line 34 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		hxDaedalus.data.Vertex vBL = new hxDaedalus.data.Vertex();
		//line 36 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		hxDaedalus.data.Edge eTL_TR = new hxDaedalus.data.Edge();
		//line 37 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		hxDaedalus.data.Edge eTR_TL = new hxDaedalus.data.Edge();
		//line 38 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		hxDaedalus.data.Edge eTR_BR = new hxDaedalus.data.Edge();
		//line 39 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		hxDaedalus.data.Edge eBR_TR = new hxDaedalus.data.Edge();
		//line 40 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		hxDaedalus.data.Edge eBR_BL = new hxDaedalus.data.Edge();
		//line 41 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		hxDaedalus.data.Edge eBL_BR = new hxDaedalus.data.Edge();
		//line 42 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		hxDaedalus.data.Edge eBL_TL = new hxDaedalus.data.Edge();
		//line 43 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		hxDaedalus.data.Edge eTL_BL = new hxDaedalus.data.Edge();
		//line 44 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		hxDaedalus.data.Edge eTR_BL = new hxDaedalus.data.Edge();
		//line 45 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		hxDaedalus.data.Edge eBL_TR = new hxDaedalus.data.Edge();
		//line 46 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		hxDaedalus.data.Edge eTL_BR = new hxDaedalus.data.Edge();
		//line 47 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		hxDaedalus.data.Edge eBR_TL = new hxDaedalus.data.Edge();
		//line 49 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		hxDaedalus.data.Face fTL_BL_TR = new hxDaedalus.data.Face();
		//line 50 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		hxDaedalus.data.Face fTR_BL_BR = new hxDaedalus.data.Face();
		//line 51 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		hxDaedalus.data.Face fTL_BR_BL = new hxDaedalus.data.Face();
		//line 52 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		hxDaedalus.data.Face fTL_TR_BR = new hxDaedalus.data.Face();
		//line 54 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		hxDaedalus.data.ConstraintShape boundShape = new hxDaedalus.data.ConstraintShape();
		//line 55 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		hxDaedalus.data.ConstraintSegment segTop = new hxDaedalus.data.ConstraintSegment();
		//line 56 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		hxDaedalus.data.ConstraintSegment segRight = new hxDaedalus.data.ConstraintSegment();
		//line 57 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		hxDaedalus.data.ConstraintSegment segBot = new hxDaedalus.data.ConstraintSegment();
		//line 58 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		hxDaedalus.data.ConstraintSegment segLeft = new hxDaedalus.data.ConstraintSegment();
		//line 60 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		hxDaedalus.data.Mesh mesh = new hxDaedalus.data.Mesh(width, height);
		//line 64 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		double offset = 10.;
		//line 65 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		vTL.get_pos().setXY(( 0 - offset ), ( 0 - offset ));
		//line 66 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		vTR.get_pos().setXY(( width + offset ), ( 0 - offset ));
		//line 67 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		vBR.get_pos().setXY(( width + offset ), ( height + offset ));
		//line 68 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		vBL.get_pos().setXY(( 0 - offset ), ( height + offset ));
		//line 70 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		vTL.setDatas(eTL_TR, null);
		//line 71 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		vTR.setDatas(eTR_BR, null);
		//line 72 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		vBR.setDatas(eBR_BL, null);
		//line 73 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		vBL.setDatas(eBL_TL, null);
		//line 75 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		eTL_TR.setDatas(vTL, eTR_TL, eTR_BR, fTL_TR_BR, true, true);
		//line 76 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		eTR_TL.setDatas(vTR, eTL_TR, eTL_BL, fTL_BL_TR, true, true);
		//line 77 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		eTR_BR.setDatas(vTR, eBR_TR, eBR_TL, fTL_TR_BR, true, true);
		//line 78 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		eBR_TR.setDatas(vBR, eTR_BR, eTR_BL, fTR_BL_BR, true, true);
		//line 79 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		eBR_BL.setDatas(vBR, eBL_BR, eBL_TL, fTL_BR_BL, true, true);
		//line 80 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		eBL_BR.setDatas(vBL, eBR_BL, eBR_TR, fTR_BL_BR, true, true);
		//line 81 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		eBL_TL.setDatas(vBL, eTL_BL, eTL_BR, fTL_BR_BL, true, true);
		//line 82 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		eTL_BL.setDatas(vTL, eBL_TL, eBL_TR, fTL_BL_TR, true, true);
		//line 83 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		eTR_BL.setDatas(vTR, eBL_TR, eBL_BR, fTR_BL_BR, true, false);
		//line 84 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		eBL_TR.setDatas(vBL, eTR_BL, eTR_TL, fTL_BL_TR, true, false);
		//line 85 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		eTL_BR.setDatas(vTL, eBR_TL, eBR_BL, fTL_BR_BL, false, false);
		//line 86 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		eBR_TL.setDatas(vBR, eTL_BR, eTL_TR, fTL_TR_BR, false, false);
		//line 88 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		fTL_BL_TR.setDatas(eBL_TR, null);
		//line 89 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		fTR_BL_BR.setDatas(eTR_BL, null);
		//line 90 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		fTL_BR_BL.setDatas(eBR_BL, false);
		//line 91 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		fTL_TR_BR.setDatas(eTR_BR, false);
		//line 94 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		vTL.set_fromConstraintSegments(new haxe.root.Array<hxDaedalus.data.ConstraintSegment>(new hxDaedalus.data.ConstraintSegment[]{segTop, segLeft}));
		//line 95 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		vTR.set_fromConstraintSegments(new haxe.root.Array<hxDaedalus.data.ConstraintSegment>(new hxDaedalus.data.ConstraintSegment[]{segTop, segRight}));
		//line 96 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		vBR.set_fromConstraintSegments(new haxe.root.Array<hxDaedalus.data.ConstraintSegment>(new hxDaedalus.data.ConstraintSegment[]{segRight, segBot}));
		//line 97 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		vBL.set_fromConstraintSegments(new haxe.root.Array<hxDaedalus.data.ConstraintSegment>(new hxDaedalus.data.ConstraintSegment[]{segBot, segLeft}));
		//line 99 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		eTL_TR.fromConstraintSegments.push(segTop);
		//line 100 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		eTR_TL.fromConstraintSegments.push(segTop);
		//line 101 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		eTR_BR.fromConstraintSegments.push(segRight);
		//line 102 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		eBR_TR.fromConstraintSegments.push(segRight);
		//line 103 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		eBR_BL.fromConstraintSegments.push(segBot);
		//line 104 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		eBL_BR.fromConstraintSegments.push(segBot);
		//line 105 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		eBL_TL.fromConstraintSegments.push(segLeft);
		//line 106 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		eTL_BL.fromConstraintSegments.push(segLeft);
		//line 108 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		segTop.get_edges().push(eTL_TR);
		//line 109 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		segRight.get_edges().push(eTR_BR);
		//line 110 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		segBot.get_edges().push(eBR_BL);
		//line 111 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		segLeft.get_edges().push(eBL_TL);
		//line 112 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		segTop.fromShape = boundShape;
		//line 113 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		segRight.fromShape = boundShape;
		//line 114 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		segBot.fromShape = boundShape;
		//line 115 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		segLeft.fromShape = boundShape;
		//line 117 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		{
			//line 117 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
			int _g = 0;
			//line 117 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
			haxe.root.Array<hxDaedalus.data.ConstraintSegment> _g1 = new haxe.root.Array<hxDaedalus.data.ConstraintSegment>(new hxDaedalus.data.ConstraintSegment[]{segTop, segRight, segBot, segLeft});
			//line 117 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
			while (( _g < _g1.length ))
			{
				//line 117 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
				hxDaedalus.data.ConstraintSegment f = _g1.__get(_g);
				//line 117 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
				 ++ _g;
				//line 117 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
				boundShape.segments.push(f);
			}
			
		}
		
		//line 118 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		{
			//line 118 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
			int _g2 = 0;
			//line 118 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
			haxe.root.Array<hxDaedalus.data.Vertex> _g11 = new haxe.root.Array<hxDaedalus.data.Vertex>(new hxDaedalus.data.Vertex[]{vTL, vTR, vBR, vBL});
			//line 118 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
			while (( _g2 < _g11.length ))
			{
				//line 118 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
				hxDaedalus.data.Vertex f1 = _g11.__get(_g2);
				//line 118 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
				 ++ _g2;
				//line 118 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
				mesh._vertices.push(f1);
			}
			
		}
		
		//line 119 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		{
			//line 119 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
			int _g3 = 0;
			//line 119 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
			haxe.root.Array<hxDaedalus.data.Edge> _g12 = new haxe.root.Array<hxDaedalus.data.Edge>(new hxDaedalus.data.Edge[]{eTL_TR, eTR_TL, eTR_BR, eBR_TR, eBR_BL, eBL_BR, eBL_TL, eTL_BL, eTR_BL, eBL_TR, eTL_BR, eBR_TL});
			//line 119 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
			while (( _g3 < _g12.length ))
			{
				//line 119 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
				hxDaedalus.data.Edge f2 = _g12.__get(_g3);
				//line 119 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
				 ++ _g3;
				//line 119 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
				mesh._edges.push(f2);
			}
			
		}
		
		//line 120 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		{
			//line 120 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
			int _g4 = 0;
			//line 120 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
			haxe.root.Array<hxDaedalus.data.Face> _g13 = new haxe.root.Array<hxDaedalus.data.Face>(new hxDaedalus.data.Face[]{fTL_BL_TR, fTR_BL_BR, fTL_BR_BL, fTL_TR_BR});
			//line 120 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
			while (( _g4 < _g13.length ))
			{
				//line 120 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
				hxDaedalus.data.Face f3 = _g13.__get(_g4);
				//line 120 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
				 ++ _g4;
				//line 120 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
				mesh._faces.push(f3);
			}
			
		}
		
		//line 121 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		mesh.get___constraintShapes().push(boundShape);
		//line 122 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		haxe.root.Array<java.lang.Object> securityRect = new haxe.root.Array<java.lang.Object>();
		//line 123 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		{
			//line 123 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
			int _g5 = 0;
			//line 123 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
			haxe.root.Array<java.lang.Object> _g14 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (0) ), ((java.lang.Object) (0) ), ((java.lang.Object) (width) ), ((java.lang.Object) (0) )});
			//line 123 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
			while (( _g5 < _g14.length ))
			{
				//line 123 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
				double f4 = ((double) (haxe.lang.Runtime.toDouble(_g14.__get(_g5))) );
				//line 123 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
				 ++ _g5;
				//line 123 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
				securityRect.push(f4);
			}
			
		}
		
		//line 124 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		{
			//line 124 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
			int _g6 = 0;
			//line 124 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
			haxe.root.Array<java.lang.Object> _g15 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (width) ), ((java.lang.Object) (0) ), ((java.lang.Object) (width) ), ((java.lang.Object) (height) )});
			//line 124 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
			while (( _g6 < _g15.length ))
			{
				//line 124 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
				double f5 = ((double) (haxe.lang.Runtime.toDouble(_g15.__get(_g6))) );
				//line 124 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
				 ++ _g6;
				//line 124 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
				securityRect.push(f5);
			}
			
		}
		
		//line 125 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		{
			//line 125 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
			int _g7 = 0;
			//line 125 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
			haxe.root.Array<java.lang.Object> _g16 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (width) ), ((java.lang.Object) (height) ), ((java.lang.Object) (0) ), ((java.lang.Object) (height) )});
			//line 125 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
			while (( _g7 < _g16.length ))
			{
				//line 125 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
				double f6 = ((double) (haxe.lang.Runtime.toDouble(_g16.__get(_g7))) );
				//line 125 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
				 ++ _g7;
				//line 125 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
				securityRect.push(f6);
			}
			
		}
		
		//line 126 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		{
			//line 126 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
			int _g8 = 0;
			//line 126 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
			haxe.root.Array<java.lang.Object> _g17 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (0) ), ((java.lang.Object) (height) ), ((java.lang.Object) (0) ), ((java.lang.Object) (0) )});
			//line 126 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
			while (( _g8 < _g17.length ))
			{
				//line 126 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
				double f7 = ((double) (haxe.lang.Runtime.toDouble(_g17.__get(_g8))) );
				//line 126 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
				 ++ _g8;
				//line 126 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
				securityRect.push(f7);
			}
			
		}
		
		//line 128 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		mesh.set_clipping(false);
		//line 129 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		mesh.insertConstraintShape(securityRect);
		//line 130 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		mesh.set_clipping(true);
		//line 132 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/factories/RectMesh.hx"
		return mesh;
	}
	
	
}


