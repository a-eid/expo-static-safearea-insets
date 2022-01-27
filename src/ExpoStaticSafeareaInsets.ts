import { NativeModulesProxy } from "expo-modules-core"
import { StatusBar } from "react-native"

const { ExpoStaticSafeareaIinsets } = NativeModulesProxy

type Insets = {
  top: number
  left: number
  right: number
  bottom: number

  navigationBarHeight: number
  statusBarHeight: number
}

export const insets: Insets = {
  top: ExpoStaticSafeareaIinsets.top - (StatusBar.currentHeight ?? 0),
  bottom: ExpoStaticSafeareaIinsets.bottom - (ExpoStaticSafeareaIinsets.navigationBarHeight ?? 0),
  left: ExpoStaticSafeareaIinsets.left,
  right: ExpoStaticSafeareaIinsets.right,

  navigationBarHeight: ExpoStaticSafeareaIinsets.navigationBarHeight ?? 0,
  statusBarHeight: StatusBar.currentHeight ?? 0,
}
