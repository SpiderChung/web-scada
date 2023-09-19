package javafish.clients.opc.variant;

import javafish.clients.opc.variant.Variant;

import java.util.ArrayList;

/**
 * ArrayList of variants 
 */
public class VariantList extends ArrayList<javafish.clients.opc.variant.Variant> {
  private static final long serialVersionUID = -3797571063094058671L;
  
  /** type of list */
  private int varType;
  
  /**
   * Create new instance of VariantList
   * 
   * @param varType Variant type of this list (Variant.xxx type)
   */
  public VariantList(int varType) {
    this.varType = javafish.clients.opc.variant.Variant.VT_ARRAY + (varType & javafish.clients.opc.variant.Variant.VT_TYPEMASK);
  }
  
  /**
   * Get variant type of list
   * 
   * @return var type, int
   */
  public int getVarType() {
    return varType;
  }
  
  /**
   * Get variant list as array of Variant
   * 
   * @return variant array Variant[]
   */
  public javafish.clients.opc.variant.Variant[] getVariantListAsArray() {
    javafish.clients.opc.variant.Variant[] arrayVarin = new javafish.clients.opc.variant.Variant[size()];
    for (int i = 0; i < arrayVarin.length; i++) {
      arrayVarin[i] = (Variant)get(i);
    }
    return arrayVarin;
  }
}
