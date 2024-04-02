import { NativeModulesProxy, EventEmitter, Subscription } from 'expo-modules-core';

// Import the native module. On web, it will be resolved to ExpoPip.web.ts
// and on native platforms to ExpoPip.ts
import ExpoPipModule from './ExpoPipModule';

export function hello(): string {
  return ExpoPipModule.hello();
}
