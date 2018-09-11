package com.vp.plugin.sample.breakdownStructurePlugin;

import com.vp.plugin.ApplicationManager;
import com.vp.plugin.DiagramManager;
import com.vp.plugin.action.VPAction;
import com.vp.plugin.action.VPActionController;
import com.vp.plugin.diagram.IBreakdownStructureUIModel;
import com.vp.plugin.diagram.IDiagramTypeConstants;
import com.vp.plugin.diagram.shape.IBSElementUIModel;
import com.vp.plugin.model.IBSElement;
import com.vp.plugin.model.ITaggedValue;
import com.vp.plugin.model.ITaggedValueContainer;
import com.vp.plugin.model.factory.IModelElementFactory;

public class BreakdownStructureAction implements VPActionController{

	@Override
	public void performAction(VPAction arg0) {
		//Create blank diagram
		DiagramManager diagramManager = ApplicationManager.instance().getDiagramManager();
		IBreakdownStructureUIModel breakdown = (IBreakdownStructureUIModel) diagramManager.createDiagram(IDiagramTypeConstants.DIAGRAM_TYPE_BREAKDOWN_STRUCTURE);
		breakdown.setName("Sample Breakdown Structure Diagram");
		breakdown.setShowTaggedValues(true);
		
		//Create the Title
		IBSElement titleProject = IModelElementFactory.instance().createBSElement();
		titleProject.setName("Project");
		titleProject.setCode(1);
		//Create the element shape on the diagram
		IBSElementUIModel shapeTitleProject = (IBSElementUIModel) diagramManager.createDiagramElement(breakdown, titleProject);
		shapeTitleProject.setBounds(425, 25, 100, 50);
		shapeTitleProject.resetCaption();
		
		//Create 1.1 Specification (One of the sub-ordinates of the title)
		//This is a sub-ordinate of the element Project
		IBSElement specification = titleProject.createBSElement();
		specification.setName("Specification");
		specification.setCode(1);
		//Create the element shape on the diagram
		IBSElementUIModel shapeSpecification = (IBSElementUIModel) diagramManager.createDiagramElement(breakdown, specification);
		shapeSpecification.setBounds(50, 125, 100, 50);
		shapeSpecification.resetCaption();
		
		//Create sub-ordinates of 1.1
		IBSElement elicRequirements = specification.createBSElement();
		elicRequirements.setName("Eliciting Requirements");
		elicRequirements.setCode(1);
		IBSElementUIModel shapeElicRequirements = (IBSElementUIModel) diagramManager.createDiagramElement(breakdown, elicRequirements);
		shapeElicRequirements.setBounds(100, 200, 125, 50);
		shapeElicRequirements.resetCaption();
		
		IBSElement anaRequirements = specification.createBSElement();
		anaRequirements.setName("Analysing Requirements");
		anaRequirements.setCode(2);
		IBSElementUIModel shapeAnaRequirements = (IBSElementUIModel) diagramManager.createDiagramElement(breakdown, anaRequirements);
		shapeAnaRequirements.setBounds(100, 275, 150, 50);
		shapeAnaRequirements.resetCaption();
		
		IBSElement wriReqSpecDoc = specification.createBSElement();
		wriReqSpecDoc.setName("Writing Requirement Specification Document");
		wriReqSpecDoc.setCode(3);
		IBSElementUIModel shapeWriReqSpecDoc = (IBSElementUIModel) diagramManager.createDiagramElement(breakdown, wriReqSpecDoc);
		shapeWriReqSpecDoc.setBounds(100, 350, 250, 50);
		shapeWriReqSpecDoc.resetCaption();
		
		IBSElement creArcPlan = specification.createBSElement();
		creArcPlan.setName("Create Architectire Plan");
		creArcPlan.setCode(4);
		IBSElementUIModel shapeCreArcPlan = (IBSElementUIModel) diagramManager.createDiagramElement(breakdown, creArcPlan);
		shapeCreArcPlan.setBounds(100, 425, 150, 50);
		shapeCreArcPlan.resetCaption();
		
		
		//Create 1.2 (One of the sub-ordinates of the title)
		IBSElement implememtation = titleProject.createBSElement();
		implememtation.setName("implementation");
		implememtation.setCode(2);
		IBSElementUIModel shapeImplementation = (IBSElementUIModel) diagramManager.createDiagramElement(breakdown, implememtation);
		shapeImplementation.setBounds(375, 125, 100, 50);
		shapeImplementation.resetCaption();
		
		//Create sun-ordinates for 1.2 (One of the sub-ordinates of the title)
		IBSElement impModA = implememtation.createBSElement();
		impModA.setName("Implementation Module A");
		impModA.setCode(1);
		IBSElementUIModel shapeImpModA = (IBSElementUIModel) diagramManager.createDiagramElement(breakdown, impModA);
		shapeImpModA.setBounds(425, 200, 150, 50);
		shapeImpModA.resetCaption();
		
		IBSElement impModB = implememtation.createBSElement();
		impModB.setName("Implementation Module B");
		impModB.setCode(2);
		IBSElementUIModel shapeImpModB = (IBSElementUIModel) diagramManager.createDiagramElement(breakdown, impModB);
		shapeImpModB.setBounds(425, 275, 150, 50);
		shapeImpModB.resetCaption();
		
		IBSElement impModC = implememtation.createBSElement();
		impModC.setName("Implementation Module C");
		impModC.setCode(3);
		impModC.setTaggedValues(newTaggedVal("Effort", ITaggedValue.TYPE_TEXT, "60h"));
		IBSElementUIModel shapeImpModC = (IBSElementUIModel) diagramManager.createDiagramElement(breakdown, impModC);
		shapeImpModC.setBounds(425, 350, 150, 50);
		shapeImpModC.resetCaption();
		
		IBSElement impModD = implememtation.createBSElement();
		impModD.setName("Implementation Module D");
		impModD.setCode(4);
		impModD.setTaggedValues(newTaggedVal("Effort", ITaggedValue.TYPE_TEXT, "60h"));
		IBSElementUIModel shapeImpModD = (IBSElementUIModel) diagramManager.createDiagramElement(breakdown, impModD);
		shapeImpModD.setBounds(425, 425, 150, 50);
		shapeImpModD.resetCaption();
		
		
		//Create 1.3 (One of the sub-ordinates of the title)
		IBSElement testing = titleProject.createBSElement();
		testing.setName("Testing");
		testing.setCode(3);
		IBSElementUIModel shapeTesting = (IBSElementUIModel) diagramManager.createDiagramElement(breakdown, testing);
		shapeTesting.setBounds(600, 125, 100, 50);
		shapeTesting.resetCaption();
		
		//Create sub-ordinates for 1.3
		IBSElement testingModuleA = testing.createBSElement();
		testingModuleA.setName("Testing Module A");
		testingModuleA.setCode(1);
		IBSElementUIModel shapeTestingModuleA = (IBSElementUIModel) diagramManager.createDiagramElement(breakdown, testingModuleA);
		shapeTestingModuleA.setBounds(650, 200, 100, 50);
		shapeTestingModuleA.resetCaption();
		
		IBSElement testingModuleB = testing.createBSElement();
		testingModuleB.setName("Testing Module B");
		testingModuleB.setCode(2);
		IBSElementUIModel shapeTestingModuleB = (IBSElementUIModel) diagramManager.createDiagramElement(breakdown, testingModuleB);
		shapeTestingModuleB.setBounds(650, 275, 100, 50);
		shapeTestingModuleB.resetCaption();
		
		IBSElement testingModuleC = testing.createBSElement();
		testingModuleC.setName("Testing Module C");
		testingModuleC.setCode(3);
		IBSElementUIModel shapeTestingModuleC = (IBSElementUIModel) diagramManager.createDiagramElement(breakdown, testingModuleC);
		shapeTestingModuleC.setBounds(650, 350, 100, 50);
		shapeTestingModuleC.resetCaption();
		
		IBSElement integrationTesting = testing.createBSElement();
		integrationTesting.setName("Integration Testing");
		integrationTesting.setCode(4);
		IBSElementUIModel shapeIntegrationTesting = (IBSElementUIModel) diagramManager.createDiagramElement(breakdown, integrationTesting);
		shapeIntegrationTesting.setBounds(650, 425, 125, 50);
		shapeIntegrationTesting.resetCaption();
		
		IBSElement acceptanceTesting = testing.createBSElement();
		acceptanceTesting.setName("Acceptance Testing");
		acceptanceTesting.setCode(5);
		IBSElementUIModel shapeAcceptanceTesting = (IBSElementUIModel) diagramManager.createDiagramElement(breakdown, acceptanceTesting);
		shapeAcceptanceTesting.setBounds(650, 500, 125, 50);
		shapeAcceptanceTesting.resetCaption();
		
		
		//Create 1.4 (One of the sub-ordinates of the title)
		IBSElement delivery = titleProject.createBSElement();
		delivery.setName("Delivery");
		delivery.setCode(4);
		IBSElementUIModel shapeDelivery = (IBSElementUIModel)diagramManager.createDiagramElement(breakdown, delivery);
		shapeDelivery.setBounds(800, 125, 100, 50);
		shapeDelivery.resetCaption();
		
		//Create sub-ordinates for 1.4 (One of the sub-ordinates of the title)
		IBSElement installingSoftware = delivery.createBSElement();
		installingSoftware.setName("Installing Software");
		installingSoftware.setCode(1);
		IBSElementUIModel shapeInstallingSoftware = (IBSElementUIModel) diagramManager.createDiagramElement(breakdown, installingSoftware);
		shapeInstallingSoftware.setBounds(850, 200, 125, 50);
		shapeInstallingSoftware.resetCaption();
		
		IBSElement training = delivery.createBSElement();
		training.setName("Training");
		training.setCode(2);
		IBSElementUIModel shapeTraining = (IBSElementUIModel) diagramManager.createDiagramElement(breakdown, training);
		shapeTraining.setBounds(850, 275, 100, 50);
		shapeTraining.resetCaption();
		
		
		//Create tagged value container
		ITaggedValueContainer tvContainerProject = IModelElementFactory.instance().createTaggedValueContainer();
		//Create tagged value
		ITaggedValue tvProject = tvContainerProject.createTaggedValue();
		tvProject.setName("Effort");
		tvProject.setType(ITaggedValue.TYPE_TEXT);
		tvProject.setValue("695 h");
		//Assign the element a tagged value container
		titleProject.setTaggedValues(tvContainerProject);
		
		//Another way to create tagged values using private method
		//newTaggedVal() is a private method that returns a tagged value container
		specification.setTaggedValues(newTaggedVal("Effort", ITaggedValue.TYPE_TEXT, "272 h"));
		elicRequirements.setTaggedValues(newTaggedVal("Effort", ITaggedValue.TYPE_TEXT, "68 h"));
		anaRequirements.setTaggedValues(newTaggedVal("Effort", ITaggedValue.TYPE_TEXT, "68 h"));
		wriReqSpecDoc.setTaggedValues(newTaggedVal("Effort", ITaggedValue.TYPE_TEXT, "68 h"));
		creArcPlan.setTaggedValues(newTaggedVal("Effort", ITaggedValue.TYPE_TEXT, "68 h"));
		implememtation.setTaggedValues(newTaggedVal("Effort", ITaggedValue.TYPE_TEXT, "252 h"));
		impModA.setTaggedValues(newTaggedVal("Effort", ITaggedValue.TYPE_TEXT, "60h"));
		impModB.setTaggedValues(newTaggedVal("Effort", ITaggedValue.TYPE_TEXT, "60h"));		
		impModC.setTaggedValues(newTaggedVal("Effort", ITaggedValue.TYPE_TEXT, "60h"));
		impModD.setTaggedValues(newTaggedVal("Effort", ITaggedValue.TYPE_TEXT, "60h"));
		testing.setTaggedValues(newTaggedVal("Effort", ITaggedValue.TYPE_TEXT, "100 h"));
		testingModuleA.setTaggedValues(newTaggedVal("Effort", ITaggedValue.TYPE_TEXT, "20 h"));
		testingModuleB.setTaggedValues(newTaggedVal("Effort", ITaggedValue.TYPE_TEXT, "20 h"));
		testingModuleC.setTaggedValues(newTaggedVal("Effort", ITaggedValue.TYPE_TEXT, "20 h"));
		integrationTesting.setTaggedValues(newTaggedVal("Effort", ITaggedValue.TYPE_TEXT, "20 h"));
		acceptanceTesting.setTaggedValues(newTaggedVal("Effort", ITaggedValue.TYPE_TEXT, "20 h"));
		delivery.setTaggedValues(newTaggedVal("Effort", ITaggedValue.TYPE_TEXT, "70 h"));
		installingSoftware.setTaggedValues(newTaggedVal("Effort", ITaggedValue.TYPE_TEXT, "10 h"));
		training.setTaggedValues(newTaggedVal("Effort", ITaggedValue.TYPE_TEXT, "60 h"));
		
		
		//Create connectors from the title
		diagramManager.createConnector(breakdown, IBreakdownStructureUIModel.SHAPETYPE_BS_CONNECTOR, shapeTitleProject, shapeSpecification, null);
		diagramManager.createConnector(breakdown, IBreakdownStructureUIModel.SHAPETYPE_BS_CONNECTOR, shapeTitleProject, shapeImplementation, null);
		diagramManager.createConnector(breakdown, IBreakdownStructureUIModel.SHAPETYPE_BS_CONNECTOR, shapeTitleProject, shapeTesting, null);
		diagramManager.createConnector(breakdown, IBreakdownStructureUIModel.SHAPETYPE_BS_CONNECTOR, shapeTitleProject, shapeDelivery, null);

		//Create connectors from 1.1
		diagramManager.createConnector(breakdown, IBreakdownStructureUIModel.SHAPETYPE_BS_CONNECTOR, shapeSpecification, shapeElicRequirements, null);
		diagramManager.createConnector(breakdown, IBreakdownStructureUIModel.SHAPETYPE_BS_CONNECTOR, shapeSpecification, shapeAnaRequirements, null);
		diagramManager.createConnector(breakdown, IBreakdownStructureUIModel.SHAPETYPE_BS_CONNECTOR, shapeSpecification, shapeWriReqSpecDoc, null);
		diagramManager.createConnector(breakdown, IBreakdownStructureUIModel.SHAPETYPE_BS_CONNECTOR, shapeSpecification, shapeCreArcPlan, null);
		
		//Create connectors form 1.2
		diagramManager.createConnector(breakdown, IBreakdownStructureUIModel.SHAPETYPE_BS_CONNECTOR, shapeImplementation, shapeImpModA, null);
		diagramManager.createConnector(breakdown, IBreakdownStructureUIModel.SHAPETYPE_BS_CONNECTOR, shapeImplementation, shapeImpModB, null);
		diagramManager.createConnector(breakdown, IBreakdownStructureUIModel.SHAPETYPE_BS_CONNECTOR, shapeImplementation, shapeImpModC, null);
		diagramManager.createConnector(breakdown, IBreakdownStructureUIModel.SHAPETYPE_BS_CONNECTOR, shapeImplementation, shapeImpModD, null);
		
		
		//Create connectors form 1.3
		diagramManager.createConnector(breakdown, IBreakdownStructureUIModel.SHAPETYPE_BS_CONNECTOR, shapeTesting, shapeTestingModuleA, null);
		diagramManager.createConnector(breakdown, IBreakdownStructureUIModel.SHAPETYPE_BS_CONNECTOR, shapeTesting, shapeTestingModuleB, null);
		diagramManager.createConnector(breakdown, IBreakdownStructureUIModel.SHAPETYPE_BS_CONNECTOR, shapeTesting, shapeTestingModuleC, null);
		diagramManager.createConnector(breakdown, IBreakdownStructureUIModel.SHAPETYPE_BS_CONNECTOR, shapeTesting, shapeIntegrationTesting, null);
		diagramManager.createConnector(breakdown, IBreakdownStructureUIModel.SHAPETYPE_BS_CONNECTOR, shapeTesting, shapeAcceptanceTesting, null);
		
		//Create Connectors form 1.4
		diagramManager.createConnector(breakdown, IBreakdownStructureUIModel.SHAPETYPE_BS_CONNECTOR, shapeDelivery, shapeInstallingSoftware, null);
		diagramManager.createConnector(breakdown, IBreakdownStructureUIModel.SHAPETYPE_BS_CONNECTOR, shapeDelivery, shapeTraining, null);
		
		
		//Show up diagram
		diagramManager.openDiagram(breakdown);
	}
	
	
	private ITaggedValueContainer newTaggedVal(String name, int type, String value) {
		//Create a tagged value container
		ITaggedValueContainer container = IModelElementFactory.instance().createTaggedValueContainer();
		//Create a tagged value in the container
		ITaggedValue taggedVal = container.createTaggedValue();
		taggedVal.setName(name);
		taggedVal.setType(type);
		taggedVal.setValue(value);
		return container;
	}

	@Override
	public void update(VPAction arg0) {
		// TODO Auto-generated method stub
		
	}

}
