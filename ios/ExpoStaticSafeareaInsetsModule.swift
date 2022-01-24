import ExpoModulesCore

public class ExpoStaticSafeareaInsetsModule: Module {
  public func definition() -> ModuleDefinition {
    name("ExpoStaticSafeareaIinsets")
    
    constants {
      let insets = UIApplication.shared.windows.first?.safeAreaInsets
      
      return [
        "top": insets?.top ?? 0.0,
        "bottom": insets?.bottom ?? 0.0,
        "left": insets?.left ?? 0.0,
        "right": insets?.right ?? 0.0,
      ]
    }
    
  }
}

