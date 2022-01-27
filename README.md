# Expo static-safearea-insets

you can always use `SafeAreaView` from `react-native` or `react-native-safearea-context`, prefer `react-native-safearea-context` because it works with both android & ios.

to avoid some flickering I created this package inspired by [react-native-static-safe-area-insets](https://github.com/Gaspard-Bruno/react-native-static-safe-area-insets)

it allows you to use safearea whereever you want, without having to use `SafeAreaView` or `useSafeAreaInsets`

## Example

```tsx
import { StyleSheet } from "react-native"
import { insets } from "expo-static-safearea-insets"

function App() {
  return <View style={styles.safeAreView}></View>
}

const styles = StyleSheet.create({
  safeAreView: {
    marginTop: insets.top,
    marginBottom: insets.bottom,
    marginLeft: insets.left,
    marginRight: insets.right,

    // or

    paddingTop: insets.top,
    paddingBottom: insets.bottom,
    paddingLeft: insets.left,
    paddingRight: insets.right,

    //  you are also able to get the statusbarHeight & navgiationBarHeight ( 0.2.0 )
    marginTop: insets.statusBarHeight,
    marginBottom: navigationBarHeight,
  },
})
```

## Installation

`npm install expo-static-safearea-insets`

or

`yarn add expo-static-safearea-insets`

recompile and run your app.

## Note

you only are able to install this package if you are using expo modules

you can use it with expo bare workflow

soon it will be available in managed workflows as well.
