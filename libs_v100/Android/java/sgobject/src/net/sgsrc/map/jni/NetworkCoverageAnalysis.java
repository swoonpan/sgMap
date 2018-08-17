/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.sgsrc.map.jni;

public class NetworkCoverageAnalysis {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected NetworkCoverageAnalysis(long cPtr, boolean cMemoryOwn) {
    if (cPtr == 0)
        throw new RuntimeException();
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }
  
  public static long getCPtr(NetworkCoverageAnalysis obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
  }

  private Object parentReference;

  protected static long getCPtrAndDisown(NetworkCoverageAnalysis obj) {
    if (obj != null)
    {
        obj.swigCMemOwn= false;
        obj.parentReference = null;
    }
    return getCPtr(obj);
  }

  /* Ensure that the GC doesn't collect any parent instance set from Java */
  protected void addReference(Object reference) {
    parentReference = reference;
  }

  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof NetworkCoverageAnalysis)
      equal = (((NetworkCoverageAnalysis)obj).swigCPtr == this.swigCPtr);
    return equal;
  }

  public int hashCode() {
     return (int)swigCPtr;
  }


  public void Destroy() {
    jniJNI.NetworkCoverageAnalysis_Destroy(swigCPtr, this);
  }

  public boolean Initialize(FeatureCollection poEdgeFtCol, String pszStNodeFieldInEdgeLayer, String pszEdNodeFieldInEdgeLayer, FeatureCollection poNodeFtCol, double dBuffer, Parameters poPgsFunc) {
    return jniJNI.NetworkCoverageAnalysis_Initialize(swigCPtr, this, FeatureCollection.getCPtr(poEdgeFtCol), poEdgeFtCol, pszStNodeFieldInEdgeLayer, pszEdNodeFieldInEdgeLayer, FeatureCollection.getCPtr(poNodeFtCol), poNodeFtCol, dBuffer, Parameters.getCPtr(poPgsFunc), poPgsFunc);
  }

  public boolean IsUsableSearch() {
    return jniJNI.NetworkCoverageAnalysis_IsUsableSearch(swigCPtr, this);
  }

  public FeatureCollection Search(Geometry poStPoint, Geometry poEdPoint, String pszWeight, Symbolizer poSymbol, boolean bAppend, boolean bLowWeight, Parameters poNodeWeightFunc) {
    long cPtr = jniJNI.NetworkCoverageAnalysis_Search(swigCPtr, this, Geometry.getCPtr(poStPoint), poStPoint, Geometry.getCPtr(poEdPoint), poEdPoint, pszWeight, Symbolizer.getCPtr(poSymbol), poSymbol, bAppend, bLowWeight, Parameters.getCPtr(poNodeWeightFunc), poNodeWeightFunc);
    return (cPtr == 0) ? null : new FeatureCollection(cPtr, false);
  }

  public boolean CreateNodeFeatureLayer(String pszStNodeFieldInEdgeLayer, String pszEdNodeFieldInEdgeLayer, String pszNewNodeFtLayerName) {
    return jniJNI.NetworkCoverageAnalysis_CreateNodeFeatureLayer(swigCPtr, this, pszStNodeFieldInEdgeLayer, pszEdNodeFieldInEdgeLayer, pszNewNodeFtLayerName);
  }

}