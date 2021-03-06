package org.aml.apimodel.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.aml.apimodel.Library;
import org.aml.apimodel.SecurityScheme;
import org.aml.apimodel.TopLevelModel;
import org.aml.apimodel.Trait;
import org.aml.typesystem.BuiltIns;
import org.aml.typesystem.ITypeRegistry;
import org.aml.typesystem.TypeRegistryImpl;

public class TopLevelModelImpl extends AnnotableImpl implements TopLevelModel{

	protected String version;
	protected TypeRegistryImpl types=new TypeRegistryImpl(BuiltIns.getBuiltInTypes());
	protected TypeRegistryImpl atypes=new TypeRegistryImpl(BuiltIns.getBuiltInTypes());
	protected LinkedHashMap<String, Library>uses=new LinkedHashMap<>();
	protected String sourceLocation;
	protected LinkedHashMap<String,String>usesLocations=new LinkedHashMap<>();
	protected ArrayList<Trait>traits=new ArrayList<>();
	public ArrayList<Trait> getTraits() {
		return traits;
	}

	public LinkedHashMap<String, String> getUsesLocations() {
		return usesLocations;
	}

	public void setUsesLocations(LinkedHashMap<String, String> usesLocations) {
		this.usesLocations = usesLocations;
	}

	protected ArrayList<SecurityScheme>securityDefinitions=new ArrayList<>();
	@Override
	public String getVersion() {
		return version;
	}

	@Override
	public ITypeRegistry types() {
		return types;
	}

	@Override
	public ITypeRegistry annotationTypes() {
		return atypes;
	}

	@Override
	public Map<String, ? extends Library> uses() {
		return uses;
	}

	@Override
	public List<SecurityScheme> securityDefinitions() {
		return securityDefinitions;
	}

	@Override
	public String getSourceLocation() {
		return sourceLocation;
	}
	
	public void setSourceLocation(String location){
		this.sourceLocation=location;
	}
	
}
