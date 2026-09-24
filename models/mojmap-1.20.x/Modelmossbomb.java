// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmossbomb<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mossbomb"), "main");
	private final ModelPart Bomb;

	public Modelmossbomb(ModelPart root) {
		this.Bomb = root.getChild("Bomb");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Bomb = partdefinition.addOrReplaceChild("Bomb", CubeListBuilder.create().texOffs(0, 24)
				.addBox(-1.0F, -7.5F, -4.0714F, 6.0F, 6.0F, 6.0F, new CubeDeformation(3.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0714F));

		PartDefinition cube_r1 = Bomb.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 12).addBox(-6.0F, -13.5F, -3.4F, 14.0F, 12.0F, 0.0F,
						new CubeDeformation(3.0F)),
				PartPose.offsetAndRotation(1.0F, 3.0F, -1.6714F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r2 = Bomb.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-11.0F, -13.5F, -3.4F, 14.0F, 12.0F, 0.0F,
						new CubeDeformation(3.0F)),
				PartPose.offsetAndRotation(5.0F, 3.0F, -3.6714F, 0.0F, 0.7854F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Bomb.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}