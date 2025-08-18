# Practical-2: Android Activity Lifecycle & Basic UI Demo

## Aim
Create an Android application to demonstrate the functions of the Activity Lifecycle and basic UI components.

## Requirements
- **Hello World** app with:
  - A `TextView` centered on the screen.
  - Yellow background (`android:background="#FFFF00"`).
  - `TextView` properties:
    - Text: “Hello World”
    - Color: Holo Blue bright (`android:textColor="@android:color/holo_blue_bright"`)
    - Font size: `27sp`
    - Text style: **bold** and *italic* (`android:textStyle="bold|italic"`).
- Logging lifecycle callbacks to Logcat using `Log`.
- Displaying lifecycle events using both `Toast` and `Snackbar`.
- Ensure logs are printed for **all** Activity lifecycle methods.

## Study Topics
- `TextView` and its attributes
- `Toast` messages
- `Snackbar` messages
- Android built-in color resources
- Activity Lifecycle methods
- Logging with `Logcat`
- `ConstraintLayout`, generating IDs for UI components

## Screenshots
| Preview | Description |
|--------|-------------|
| <img src="https://raw.githubusercontent.com/deep6161/MAD_23012021032_PRACTICAL2/master/SCREENSHOT/SCRREENSHOT-1.png" width="250> | **Logcat display** showing lifecycle method logs |
| <img src="https://raw.githubusercontent.com/deep6161/MAD_23012021032_PRACTICAL2/master/SCREENSHOT/Screenshot_20250818_132814.png width="250""> | **Snackbar message** demonstration |
| <img src="https://raw.githubusercontent.com/deep6161/MAD_23012021032_PRACTICAL2/master/SCREENSHOT/Screenshot_20250818_132832.png width="250""> | **Toast message** demonstration |

---

## How to Run
1. Open the project in **Android Studio**.
2. Build and run on an emulator or physical device.
3. Observe:
   - The `TextView` with correct styling and positioning.
   - Logcat entries for each lifecycle method.
   - Toast and Snackbar messages appearing at appropriate lifecycle points (e.g., `onStart()`, `onResume()`, `onPause()`, etc.).

## Notes
- Use `ConstraintLayout` as the root layout.
- Use `Log.d(TAG, "methodName called")` inside each overridden lifecycle callback, where `TAG` is your class name identifier.
- Invoke `Toast.makeText(...)` and `Snackbar.make(...).show()` at matching lifecycle methods to demonstrate both UI notification types.

---

**Enjoy exploring the Activity Lifecycle behavior visually and via logs!**
