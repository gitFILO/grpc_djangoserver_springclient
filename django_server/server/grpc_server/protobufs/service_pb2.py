# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: service.proto
# Protobuf Python Version: 5.27.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import runtime_version as _runtime_version
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
_runtime_version.ValidateProtobufRuntimeVersion(
    _runtime_version.Domain.PUBLIC,
    5,
    27,
    2,
    '',
    'service.proto'
)
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\rservice.proto\x12\x0cgrpc_example\"!\n\x0eRequestMessage\x12\x0f\n\x07message\x18\x01 \x01(\t\" \n\x0fResponseMessage\x12\r\n\x05reply\x18\x01 \x01(\t2^\n\x0e\x45xampleService\x12L\n\x0bSendMessage\x12\x1c.grpc_example.RequestMessage\x1a\x1d.grpc_example.ResponseMessage\"\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'service_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  DESCRIPTOR._loaded_options = None
  _globals['_REQUESTMESSAGE']._serialized_start=31
  _globals['_REQUESTMESSAGE']._serialized_end=64
  _globals['_RESPONSEMESSAGE']._serialized_start=66
  _globals['_RESPONSEMESSAGE']._serialized_end=98
  _globals['_EXAMPLESERVICE']._serialized_start=100
  _globals['_EXAMPLESERVICE']._serialized_end=194
# @@protoc_insertion_point(module_scope)
