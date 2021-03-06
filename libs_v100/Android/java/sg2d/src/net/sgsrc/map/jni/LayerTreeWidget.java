/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.sgsrc.map.jni;

public class LayerTreeWidget extends Widget {
  private long swigCPtr;

  protected LayerTreeWidget(long cPtr, boolean cMemoryOwn) {
    super(jniJNI.LayerTreeWidget_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(LayerTreeWidget obj) {
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
    super.delete();
  }

  private Object parentReference;

  protected static long getCPtrAndDisown(LayerTreeWidget obj) {
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
    if (obj instanceof LayerTreeWidget)
      equal = (((LayerTreeWidget)obj).swigCPtr == this.swigCPtr);
    return equal;
  }

  public int hashCode() {
     return (int)swigCPtr;
  }


  public int IndexOfSelectedItem() {
    return jniJNI.LayerTreeWidget_IndexOfSelectedItem(swigCPtr, this);
  }

  public boolean GetDisplayToolBar() {
    return jniJNI.LayerTreeWidget_GetDisplayToolBar(swigCPtr, this);
  }

  public void SetDisplayToolBar(boolean bVal) {
    jniJNI.LayerTreeWidget_SetDisplayToolBar(swigCPtr, this, bVal);
  }

  public void SetDisplayContextMenu(boolean bVal) {
    jniJNI.LayerTreeWidget_SetDisplayContextMenu(swigCPtr, this, bVal);
  }

  public FeatureLayer GetFeatureLayer(int index) {
    long cPtr = jniJNI.LayerTreeWidget_GetFeatureLayer(swigCPtr, this, index);
    return (cPtr == 0) ? null : new FeatureLayer(cPtr, false);
  }

  public Layer GetLayer(int index) {
    long cPtr = jniJNI.LayerTreeWidget_GetLayer(swigCPtr, this, index);
    return (cPtr == 0) ? null : new Layer(cPtr, false);
  }

}
