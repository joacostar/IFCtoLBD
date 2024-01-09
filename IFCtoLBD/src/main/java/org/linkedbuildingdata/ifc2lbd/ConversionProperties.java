package org.linkedbuildingdata.ifc2lbd;

public class ConversionProperties {
	boolean hasBuildingElements = true;
	boolean hasSeparateBuildingElementsModel = false;
	boolean hasBuildingProperties = true;
	boolean hasSeparatePropertiesModel = false;
	boolean hasGeolocation = false;
	boolean hasGeometry = false;
	boolean exportIfcOWL=true;
	boolean hasUnits=false;
	
	
	public ConversionProperties() {
		
	}

	public boolean isHasBuildingElements() {
		return hasBuildingElements;
	}


	public void setHasBuildingElements(boolean hasBuildingElements) {
		this.hasBuildingElements = hasBuildingElements;
	}


	public boolean isHasSeparateBuildingElementsModel() {
		return hasSeparateBuildingElementsModel;
	}


	public void setHasSeparateBuildingElementsModel(boolean hasSeparateBuildingElementsModel) {
		this.hasSeparateBuildingElementsModel = hasSeparateBuildingElementsModel;
	}


	public boolean isHasBuildingProperties() {
		return hasBuildingProperties;
	}


	public void setHasBuildingProperties(boolean hasBuildingProperties) {
		this.hasBuildingProperties = hasBuildingProperties;
	}


	public boolean isHasSeparatePropertiesModel() {
		return hasSeparatePropertiesModel;
	}


	public void setHasSeparatePropertiesModel(boolean hasSeparatePropertiesModel) {
		this.hasSeparatePropertiesModel = hasSeparatePropertiesModel;
	}


	public boolean isHasGeolocation() {
		return hasGeolocation;
	}


	public void setHasGeolocation(boolean hasGeolocation) {
		this.hasGeolocation = hasGeolocation;
	}


	public boolean isHasGeometry() {
		return hasGeometry;
	}


	public void setHasGeometry(boolean hasGeometry) {
		this.hasGeometry = hasGeometry;
	}


	public boolean isExportIfcOWL() {
		return exportIfcOWL;
	}


	public void setExportIfcOWL(boolean exportIfcOWL) {
		this.exportIfcOWL = exportIfcOWL;
	}


	public boolean isHasUnits() {
		return hasUnits;
	}


	public void setHasUnits(boolean hasUnits) {
		this.hasUnits = hasUnits;
	}
	
	
}
