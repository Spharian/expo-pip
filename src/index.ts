import { NativeModulesProxy, EventEmitter, Subscription } from 'expo-modules-core';

// Import the native module. On web, it will be resolved to ExpoPip.web.ts
// and on native platforms to ExpoPip.ts
import ExpoPipModule from './ExpoPipModule';

const emitter = new EventEmitter(ExpoPipModule);

export function enterPipMode() {
  return ExpoPipModule.enterPipMode();
}

export function addPictureInPictureModeListener(listener): Subscription {
  return emitter.addListener('onPictureInPictureModeChange', listener);
}
