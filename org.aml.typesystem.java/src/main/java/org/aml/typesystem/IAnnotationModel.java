package org.aml.typesystem;

import java.util.Map;

/**
 * <p>IAnnotationModel interface.</p>
 *
 * @author kor
 * @version $Id: $Id
 */
public interface IAnnotationModel {

	/**
	 * <p>getName.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getName();
	
	/**
	 * <p>getFullyQualifiedName.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	String getCanonicalName();
	
	/**
	 * <p>getValue.</p>
	 *
	 * @param pairName a {@link java.lang.String} object.
	 * @return a {@link java.lang.String} object.
	 */
	public String getValue(String pairName);

	/**
	 * <p>getValues.</p>
	 *
	 * @param value a {@link java.lang.String} object.
	 * @return an array of {@link java.lang.String} objects.
	 */
	public String[] getValues(String value);
	
	/**
	 * <p>getSubAnnotations.</p>
	 *
	 * @param pairName a {@link java.lang.String} object.
	 * @return an array of {@link org.aml.typesystem.IAnnotationModel} objects.
	 */
	IAnnotationModel[] getSubAnnotations(String pairName);

	/**
	 * <p>getType.</p>
	 *
	 * @return a {@link org.aml.typesystem.ITypeModel} object.
	 */
	ITypeModel getType();

	/**
	 * <p>allValues.</p>
	 *
	 * @return a {@link java.util.Map} object.
	 */
	Map<String,Object> allValues();
}
