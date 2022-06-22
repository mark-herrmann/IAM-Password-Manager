/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

#import <Foundation/Foundation.h>

#import "TProtocol.h"
#import "TApplicationException.h"
#import "TProtocolException.h"
#import "TProtocolUtil.h"
#import "TProcessor.h"
#import "TObjective-C.h"
#import "TBase.h"
#import "TAsyncTransport.h"
#import "TProtocolFactory.h"
#import "TBaseClient.h"

#import "AppSystem.h"

@protocol ServerToApp <NSObject>
- (void) disconnect;  // throws AppException *, TException
- (BOOL) sendMessage: (AppMessage *) appMessage;  // throws AppException *, TException
- (void) authAppMessageResponse: (AuthAppMessageResponse *) authAppMessageResponse;  // throws AppException *, TException
- (void) proxyOpen: (int64_t) handle ipHost: (NSString *) ipHost port: (int32_t) port secure: (BOOL) secure verifyCertificate: (BOOL) verifyCertificate;  // throws AppException *, TException
- (void) proxyData: (int64_t) handle data: (NSData *) data;  // throws AppException *, TException
- (void) proxyClose: (int64_t) handle;  // throws TException
@end

@interface ServerToAppClient : TBaseClient <ServerToApp> - (id) initWithProtocol: (id <TProtocol>) protocol;
- (id) initWithInProtocol: (id <TProtocol>) inProtocol outProtocol: (id <TProtocol>) outProtocol;
@end

@interface ServerToAppProcessor : NSObject <TProcessor> {
  id <ServerToApp> mService;
  NSDictionary * mMethodMap;
}
- (id) initWithServerToApp: (id <ServerToApp>) service;
- (id<ServerToApp>) service;
@end

@interface ServerToAppConstants : NSObject {
}
@end
