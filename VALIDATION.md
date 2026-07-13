# 第四版修正版验证说明（1.3.1）

本修正版解决 Minecraft 1.21.11 编译错误：

- 删除已经不存在的 `RenderSystem.disableDepthTest()` / `enableDepthTest()` 调用；
- 将 `context.consumers()` 保存为 `VertexConsumerProvider`；
- 仅在其实际类型为 `VertexConsumerProvider.Immediate` 时调用 `draw(layer)`。

原报错中的三个 `cannot find symbol` 均已针对 Yarn 1.21.11 API 修正。

注意：当前修正优先保证可编译和正常渲染。`RenderLayers.debugFilledBox()` 仍使用该层自身的深度状态；真正稳定的“无深度测试透墙渲染”需要为 1.21.11 单独注册自定义 RenderPipeline，而不能再通过旧版 RenderSystem 的全局开关实现。
