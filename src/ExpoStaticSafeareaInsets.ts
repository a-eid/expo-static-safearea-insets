import {NativeModulesProxy} from 'expo-modules-core'
import {StatusBar} from 'react-native'

const {ExpoStaticSafeareaIinsets} = NativeModulesProxy

type Insets = {
  top: number
  left: number
  topWithoutStatusBarHeight: number
  right: number
  bottom: number
}

export const insets: Insets = {
  top: ExpoStaticSafeareaIinsets.top,
  topWithoutStatusBarHeight: ExpoStaticSafeareaIinsets.top - (StatusBar.currentHeight ?? 0),
  bottom: ExpoStaticSafeareaIinsets.bottom,
  left: ExpoStaticSafeareaIinsets.left,
  right: ExpoStaticSafeareaIinsets.right,
}
