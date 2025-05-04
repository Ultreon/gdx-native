package dev.ultreon.gdx.c;

import com.badlogic.gdx.graphics.GL32;
import org.teavm.interop.Address;
import org.teavm.interop.Import;

import java.nio.*;

public class OpenGL {
    @Import(name = "glBlendBarrier")
    public static native void glBlendBarrier();

    @Import(name = "glCopyImageSubData")
    public static native void glCopyImageSubData(int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int srcWidth, int srcHeight, int srcDepth);

    @Import(name = "glDebugMessageControl")
    public static native void glDebugMessageControl(int source, int type, int severity, Address ids, boolean enabled);

    @Import(name = "glDebugMessageInsert")
    public static native void glDebugMessageInsert(int source, int type, int id, int severity, String buf);

    @Import(name = "glDebugMessageCallback")
    public static native void glDebugMessageCallback(GL32.DebugProc callback);

    @Import(name = "glGetDebugMessageLog")
    public static native int glGetDebugMessageLog(int count, Address sources, Address types, Address ids, Address severities, Address lengths, Address messageLog);

    @Import(name = "glPushDebugGroup")
    public static native void glPushDebugGroup(int source, int id, String message);

    @Import(name = "glPopDebugGroup")
    public static native void glPopDebugGroup();

    @Import(name = "glObjectLabel")
    public static native void glObjectLabel(int identifier, int name, String label);

    @Import(name = "glGetObjectLabel")
    public static native String glGetObjectLabel(int identifier, int name);

    @Import(name = "glGetPointerv")
    public static native long glGetPointerv(int pname);

    @Import(name = "glEnablei")
    public static native void glEnablei(int target, int index);

    @Import(name = "glDisablei")
    public static native void glDisablei(int target, int index);

    @Import(name = "glBlendEquationi")
    public static native void glBlendEquationi(int buf, int mode);

    @Import(name = "glBlendEquationSeparatei")
    public static native void glBlendEquationSeparatei(int buf, int modeRGB, int modeAlpha);

    @Import(name = "glBlendFunci")
    public static native void glBlendFunci(int buf, int src, int dst);

    @Import(name = "glBlendFuncSeparatei")
    public static native void glBlendFuncSeparatei(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha);

    @Import(name = "glColorMaski")
    public static native void glColorMaski(int index, boolean r, boolean g, boolean b, boolean a);

    @Import(name = "glIsEnabledi")
    public static native boolean glIsEnabledi(int target, int index);

    @Import(name = "glDrawElementsBaseVertex")
    public static native void glDrawElementsBaseVertex(int mode, int count, int type, Address indices, int basevertex);

    @Import(name = "glDrawRangeElementsBaseVertex")
    public static native void glDrawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, Address indices, int basevertex);

    @Import(name = "glDrawElementsInstancedBaseVertex")
    public static native void glDrawElementsInstancedBaseVertex(int mode, int count, int type, Address indices, int instanceCount, int basevertex);

    @Import(name = "glDrawElementsInstancedBaseVertex")
    public static native void glDrawElementsInstancedBaseVertex(int mode, int count, int type, int indicesOffset, int instanceCount, int basevertex);

    @Import(name = "glFramebufferTexture")
    public static native void glFramebufferTexture(int target, int attachment, int texture, int level);

    @Import(name = "glGetGraphicsResetStatus")
    public static native int glGetGraphicsResetStatus();

    @Import(name = "glReadnPixels")
    public static native void glReadnPixels(int x, int y, int width, int height, int format, int type, int bufSize, Address data);

    @Import(name = "glGetnUniformfv")
    public static native void glGetnUniformfv(int program, int location, Address params);

    @Import(name = "glGetnUniformiv")
    public static native void glGetnUniformiv(int program, int location, Address params);

    @Import(name = "glGetnUniformuiv")
    public static native void glGetnUniformuiv(int program, int location, Address params);

    @Import(name = "glMinSampleShading")
    public static native void glMinSampleShading(float value);

    @Import(name = "glPatchParameteri")
    public static native void glPatchParameteri(int pname, int value);

    @Import(name = "glTexParameterIiv")
    public static native void glTexParameterIiv(int target, int pname, Address params);

    @Import(name = "glTexParameterIuiv")
    public static native void glTexParameterIuiv(int target, int pname, Address params);

    @Import(name = "glGetTexParameterIiv")
    public static native void glGetTexParameterIiv(int target, int pname, Address params);

    @Import(name = "glGetTexParameterIuiv")
    public static native void glGetTexParameterIuiv(int target, int pname, Address params);

    @Import(name = "glSamplerParameterIiv")
    public static native void glSamplerParameterIiv(int sampler, int pname, Address param);

    @Import(name = "glSamplerParameterIuiv")
    public static native void glSamplerParameterIuiv(int sampler, int pname, Address param);

    @Import(name = "glGetSamplerParameterIiv")
    public static native void glGetSamplerParameterIiv(int sampler, int pname, Address params);

    @Import(name = "glGetSamplerParameterIuiv")
    public static native void glGetSamplerParameterIuiv(int sampler, int pname, Address params);

    @Import(name = "glTexBuffer")
    public static native void glTexBuffer(int target, int internalformat, int buffer);

    @Import(name = "glTexBufferRange")
    public static native void glTexBufferRange(int target, int internalformat, int buffer, int offset, int size);

    @Import(name = "glTexStorage3DMultisample")
    public static native void glTexStorage3DMultisample(int target, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations);

    @Import(name = "glDispatchCompute")
    public static native void glDispatchCompute(int num_groups_x, int num_groups_y, int num_groups_z);

    @Import(name = "glDispatchComputeIndirect")
    public static native void glDispatchComputeIndirect(long indirect);

    @Import(name = "glDrawArraysIndirect")
    public static native void glDrawArraysIndirect(int mode, long indirect);

    @Import(name = "glDrawElementsIndirect")
    public static native void glDrawElementsIndirect(int mode, int type, long indirect);

    @Import(name = "glFramebufferParameteri")
    public static native void glFramebufferParameteri(int target, int pname, int param);

    @Import(name = "glGetFramebufferParameteriv")
    public static native void glGetFramebufferParameteriv(int target, int pname, Address params);

    @Import(name = "glGetProgramInterfaceiv")
    public static native void glGetProgramInterfaceiv(int program, int programInterface, int pname, Address params);

    @Import(name = "glGetProgramResourceIndex")
    public static native int glGetProgramResourceIndex(int program, int programInterface, String name);

    @Import(name = "glGetProgramResourceName")
    public static native String glGetProgramResourceName(int program, int programInterface, int index);

    @Import(name = "glGetProgramResourceiv")
    public static native void glGetProgramResourceiv(int program, int programInterface, int index, Address props, Address length, Address params);

    @Import(name = "glGetProgramResourceLocation")
    public static native int glGetProgramResourceLocation(int program, int programInterface, String name);

    @Import(name = "glUseProgramStages")
    public static native void glUseProgramStages(int pipeline, int stages, int program);

    @Import(name = "glActiveShaderProgram")
    public static native void glActiveShaderProgram(int pipeline, int program);

    @Import(name = "glCreateShaderProgramv")
    public static native int glCreateShaderProgramv(int type, String[] strings);

    @Import(name = "glBindProgramPipeline")
    public static native void glBindProgramPipeline(int pipeline);

    @Import(name = "glDeleteProgramPipelines")
    public static native void glDeleteProgramPipelines(int n, Address pipelines);

    @Import(name = "glGenProgramPipelines")
    public static native void glGenProgramPipelines(int n, Address pipelines);

    @Import(name = "glIsProgramPipeline")
    public static native boolean glIsProgramPipeline(int pipeline);

    @Import(name = "glGetProgramPipelineiv")
    public static native void glGetProgramPipelineiv(int pipeline, int pname, Address params);

    @Import(name = "glProgramUniform1i")
    public static native void glProgramUniform1i(int program, int location, int v0);

    @Import(name = "glProgramUniform2i")
    public static native void glProgramUniform2i(int program, int location, int v0, int v1);

    @Import(name = "glProgramUniform3i")
    public static native void glProgramUniform3i(int program, int location, int v0, int v1, int v2);

    @Import(name = "glProgramUniform4i")
    public static native void glProgramUniform4i(int program, int location, int v0, int v1, int v2, int v3);

    @Import(name = "glProgramUniform1ui")
    public static native void glProgramUniform1ui(int program, int location, int v0);

    @Import(name = "glProgramUniform2ui")
    public static native void glProgramUniform2ui(int program, int location, int v0, int v1);

    @Import(name = "glProgramUniform3ui")
    public static native void glProgramUniform3ui(int program, int location, int v0, int v1, int v2);

    @Import(name = "glProgramUniform4ui")
    public static native void glProgramUniform4ui(int program, int location, int v0, int v1, int v2, int v3);

    @Import(name = "glProgramUniform1f")
    public static native void glProgramUniform1f(int program, int location, float v0);

    @Import(name = "glProgramUniform2f")
    public static native void glProgramUniform2f(int program, int location, float v0, float v1);

    @Import(name = "glProgramUniform3f")
    public static native void glProgramUniform3f(int program, int location, float v0, float v1, float v2);

    @Import(name = "glProgramUniform4f")
    public static native void glProgramUniform4f(int program, int location, float v0, float v1, float v2, float v3);

    @Import(name = "glProgramUniform1iv")
    public static native void glProgramUniform1iv(int program, int location, Address value);

    @Import(name = "glProgramUniform2iv")
    public static native void glProgramUniform2iv(int program, int location, Address value);

    @Import(name = "glProgramUniform3iv")
    public static native void glProgramUniform3iv(int program, int location, Address value);

    @Import(name = "glProgramUniform4iv")
    public static native void glProgramUniform4iv(int program, int location, Address value);

    @Import(name = "glProgramUniform1uiv")
    public static native void glProgramUniform1uiv(int program, int location, Address value);

    @Import(name = "glProgramUniform2uiv")
    public static native void glProgramUniform2uiv(int program, int location, Address value);

    @Import(name = "glProgramUniform3uiv")
    public static native void glProgramUniform3uiv(int program, int location, Address value);

    @Import(name = "glProgramUniform4uiv")
    public static native void glProgramUniform4uiv(int program, int location, Address value);

    @Import(name = "glProgramUniform1fv")
    public static native void glProgramUniform1fv(int program, int location, Address value);

    @Import(name = "glProgramUniform2fv")
    public static native void glProgramUniform2fv(int program, int location, Address value);

    @Import(name = "glProgramUniform3fv")
    public static native void glProgramUniform3fv(int program, int location, Address value);

    @Import(name = "glProgramUniform4fv")
    public static native void glProgramUniform4fv(int program, int location, Address value);

    @Import(name = "glProgramUniformMatrix2fv")
    public static native void glProgramUniformMatrix2fv(int program, int location, boolean transpose, Address value);

    @Import(name = "glProgramUniformMatrix3fv")
    public static native void glProgramUniformMatrix3fv(int program, int location, boolean transpose, Address value);

    @Import(name = "glProgramUniformMatrix4fv")
    public static native void glProgramUniformMatrix4fv(int program, int location, boolean transpose, Address value);

    @Import(name = "glProgramUniformMatrix2x3fv")
    public static native void glProgramUniformMatrix2x3fv(int program, int location, boolean transpose, Address value);

    @Import(name = "glProgramUniformMatrix3x2fv")
    public static native void glProgramUniformMatrix3x2fv(int program, int location, boolean transpose, Address value);

    @Import(name = "glProgramUniformMatrix2x4fv")
    public static native void glProgramUniformMatrix2x4fv(int program, int location, boolean transpose, Address value);

    @Import(name = "glProgramUniformMatrix4x2fv")
    public static native void glProgramUniformMatrix4x2fv(int program, int location, boolean transpose, Address value);

    @Import(name = "glProgramUniformMatrix3x4fv")
    public static native void glProgramUniformMatrix3x4fv(int program, int location, boolean transpose, Address value);

    @Import(name = "glProgramUniformMatrix4x3fv")
    public static native void glProgramUniformMatrix4x3fv(int program, int location, boolean transpose, Address value);

    @Import(name = "glValidateProgramPipeline")
    public static native void glValidateProgramPipeline(int pipeline);

    @Import(name = "glGetProgramPipelineInfoLog")
    public static native String glGetProgramPipelineInfoLog(int program);

    @Import(name = "glBindImageTexture")
    public static native void glBindImageTexture(int unit, int texture, int level, boolean layered, int layer, int access, int format);

    @Import(name = "glGetBooleani_v")
    public static native void glGetBooleani_v(int target, int index, Address data);

    @Import(name = "glMemoryBarrier")
    public static native void glMemoryBarrier(int barriers);

    @Import(name = "glMemoryBarrierByRegion")
    public static native void glMemoryBarrierByRegion(int barriers);

    @Import(name = "glTexStorage2DMultisample")
    public static native void glTexStorage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations);

    @Import(name = "glGetMultisamplefv")
    public static native void glGetMultisamplefv(int pname, int index, Address val);

    @Import(name = "glSampleMaski")
    public static native void glSampleMaski(int maskNumber, int mask);

    @Import(name = "glGetTexLevelParameteriv")
    public static native void glGetTexLevelParameteriv(int target, int level, int pname, Address params);

    @Import(name = "glGetTexLevelParameterfv")
    public static native void glGetTexLevelParameterfv(int target, int level, int pname, Address params);

    @Import(name = "glBindVertexBuffer")
    public static native void glBindVertexBuffer(int bindingindex, int buffer, long offset, int stride);

    @Import(name = "glVertexAttribFormat")
    public static native void glVertexAttribFormat(int attribindex, int size, int type, boolean normalized, int relativeoffset);

    @Import(name = "glVertexAttribIFormat")
    public static native void glVertexAttribIFormat(int attribindex, int size, int type, int relativeoffset);

    @Import(name = "glVertexAttribBinding")
    public static native void glVertexAttribBinding(int attribindex, int bindingindex);

    @Import(name = "glVertexBindingDivisor")
    public static native void glVertexBindingDivisor(int bindingindex, int divisor);

    @Import(name = "glReadBuffer")
    public static native void glReadBuffer(int mode);

    @Import(name = "glDrawRangeElements")
    public static native void glDrawRangeElements(int mode, int start, int end, int count, int type, Address indices);

    @Import(name = "glDrawRangeElements")
    public static native void glDrawRangeElements(int mode, int start, int end, int count, int type, int offset);

    @Import(name = "glTexImage2D")
    public static native void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, int offset);

    @Import(name = "glTexImage3D")
    public static native void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, Address pixels);

    @Import(name = "glTexImage3D")
    public static native void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, int offset);

    @Import(name = "glTexSubImage2D")
    public static native void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, int offset);

    @Import(name = "glTexSubImage3D")
    public static native void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, Address pixels);

    @Import(name = "glTexSubImage3D")
    public static native void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int offset);

    @Import(name = "glCopyTexSubImage3D")
    public static native void glCopyTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height);

    @Import(name = "glGenQueries")
    public static native void glGenQueries(int n, Address ids, int offset);

    @Import(name = "glGenQueries")
    public static native void glGenQueries(int n, Address ids);

    @Import(name = "glDeleteQueries")
    public static native void glDeleteQueries(int n, Address ids, int offset);

    @Import(name = "glDeleteQueries")
    public static native void glDeleteQueries(int n, Address ids);

    @Import(name = "glIsQuery")
    public static native boolean glIsQuery(int id);

    @Import(name = "glBeginQuery")
    public static native void glBeginQuery(int target, int id);
    
    @Import(name = "glEndQuery")
    public static native void glEndQuery(int target);
    
    @Import(name = "glGetQueryiv")
    public static native void glGetQueryiv(int target, int pname, Address params);
    
    @Import(name = "glGetQueryObjectuiv")
    public static native void glGetQueryObjectuiv(int id, int pname, Address params);
    
    @Import(name = "glUnmapBuffer")
    public static native boolean glUnmapBuffer(int target);
    
    @Import(name = "glGetBufferPointerv")
    public static native Address glGetBufferPointerv(int target, int pname);
    
    @Import(name = "glDrawBuffers")
    public static native void glDrawBuffers(int n, Address bufs);
    
    @Import(name = "glUniformMatrix2x3fv")
    public static native void glUniformMatrix2x3fv(int location, int count, boolean transpose, Address value);
    
    @Import(name = "glUniformMatrix3x2fv")
    public static native void glUniformMatrix3x2fv(int location, int count, boolean transpose, Address value);
    
    @Import(name = "glUniformMatrix2x4fv")
    public static native void glUniformMatrix2x4fv(int location, int count, boolean transpose, Address value);
    
    @Import(name = "glUniformMatrix4x2fv")
    public static native void glUniformMatrix4x2fv(int location, int count, boolean transpose, Address value);
    
    @Import(name = "glUniformMatrix3x4fv")
    public static native void glUniformMatrix3x4fv(int location, int count, boolean transpose, Address value);
    
    @Import(name = "glUniformMatrix4x3fv")
    public static native void glUniformMatrix4x3fv(int location, int count, boolean transpose, Address value);
    @Import(name = "glBlitFramebuffer")
    public static native void glBlitFramebuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter);

    @Import(name = "glRenderbufferStorageMultisample")
    public static native void glRenderbufferStorageMultisample(int target, int samples, int internalformat, int width, int height);

    @Import(name = "glFramebufferTextureLayer")
    public static native void glFramebufferTextureLayer(int target, int attachment, int texture, int level, int layer);

    @Import(name = "glMapBufferRange")
    public static native Address glMapBufferRange(int target, int offset, int length, int access);

    @Import(name = "glFlushMappedBufferRange")
    public static native void glFlushMappedBufferRange(int target, int offset, int length);

    @Import(name = "glBindVertexArray")
    public static native void glBindVertexArray(int array);

    @Import(name = "glDeleteVertexArrays")
    public static native void glDeleteVertexArrays(int n, Address arrays);

    @Import(name = "glDeleteVertexArrays")
    public static native void glDeleteVertexArrays(int n, Address arrays, int offset);

    @Import(name = "glGenVertexArrays")
    public static native void glGenVertexArrays(int n, Address arrays);

    @Import(name = "glGenVertexArrays")
    public static native void glGenVertexArrays(int n, Address arrays, int offset);

    @Import(name = "glIsVertexArray")
    public static native boolean glIsVertexArray(int array);

    @Import(name = "glBeginTransformFeedback")
    public static native void glBeginTransformFeedback(int primitiveMode);

    @Import(name = "glEndTransformFeedback")
    public static native void glEndTransformFeedback();

    @Import(name = "glBindBufferRange")
    public static native void glBindBufferRange(int target, int index, int buffer, int offset, int size);

    @Import(name = "glBindBufferBase")
    public static native void glBindBufferBase(int target, int index, int buffer);

    @Import(name = "glTransformFeedbackVaryings")
    public static native void glTransformFeedbackVaryings(int program, String[] varyings, int bufferMode);

    @Import(name = "glVertexAttribIPointer")
    public static native void glVertexAttribIPointer(int index, int size, int type, int stride, int offset);

    @Import(name = "glGetVertexAttribIiv")
    public static native void glGetVertexAttribIiv(int index, int pname, Address params);

    @Import(name = "glGetVertexAttribIuiv")
    public static native void glGetVertexAttribIuiv(int index, int pname, Address params);

    @Import(name = "glVertexAttribI4i")
    public static native void glVertexAttribI4i(int index, int x, int y, int z, int w);

    @Import(name = "glVertexAttribI4ui")
    public static native void glVertexAttribI4ui(int index, int x, int y, int z, int w);

    @Import(name = "glGetUniformuiv")
    public static native void glGetUniformuiv(int program, int location, Address params);

    @Import(name = "glGetFragDataLocation")
    public static native int glGetFragDataLocation(int program, String name);

    @Import(name = "glUniform1uiv")
    public static native void glUniform1uiv(int location, int count, Address value);

    @Import(name = "glUniform3uiv")
    public static native void glUniform3uiv(int location, int count, Address value);

    @Import(name = "glUniform4uiv")
    public static native void glUniform4uiv(int location, int count, Address value);

    @Import(name = "glClearBufferiv")
    public static native void glClearBufferiv(int buffer, int drawbuffer, Address value);

    @Import(name = "glClearBufferuiv")
    public static native void glClearBufferuiv(int buffer, int drawbuffer, Address value);

    @Import(name = "glClearBufferfv")
    public static native void glClearBufferfv(int buffer, int drawbuffer, Address value);

    @Import(name = "glClearBufferfi")
    public static native void glClearBufferfi(int buffer, int drawbuffer, float depth, int stencil);

    @Import(name = "glGetStringi")
    public static native String glGetStringi(int name, int index);

    @Import(name = "glCopyBufferSubData")
    public static native void glCopyBufferSubData(int readTarget, int writeTarget, int readOffset, int writeOffset, int size);

    @Import(name = "glGetUniformIndices")
    public static native void glGetUniformIndices(int program, String[] uniformNames, Address uniformIndices);

    @Import(name = "glGetActiveUniformsiv")
    public static native void glGetActiveUniformsiv(int program, int uniformCount, Address uniformIndices, int pname, Address params);

    @Import(name = "glGetUniformBlockIndex")
    public static native int glGetUniformBlockIndex(int program, String uniformBlockName);

    @Import(name = "glGetActiveUniformBlockiv")
    public static native void glGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, Address params);

    @Import(name = "glGetActiveUniformBlockName")
    public static native void glGetActiveUniformBlockName(int program, int uniformBlockIndex, Address length, Address uniformBlockName);

    @Import(name = "glGetActiveUniformBlockName")
    public static native String glGetActiveUniformBlockName(int program, int uniformBlockIndex);

    @Import(name = "glUniformBlockBinding")
    public static native void glUniformBlockBinding(int program, int uniformBlockIndex, int uniformBlockBinding);

    @Import(name = "glDrawArraysInstanced")
    public static native void glDrawArraysInstanced(int mode, int first, int count, int instanceCount);

    @Import(name = "glDrawElementsInstanced")
    public static native void glDrawElementsInstanced(int mode, int count, int type, int indicesOffset, int instanceCount);

    @Import(name = "glGetInteger64v")
    public static native void glGetInteger64v(int pname, Address params);

    @Import(name = "glGetBufferParameteri64v")
    public static native void glGetBufferParameteri64v(int target, int pname, Address params);

    @Import(name = "glGenSamplers")
    public static native void glGenSamplers(int count, Address samplers, int offset);

    @Import(name = "glGenSamplers")
    public static native void glGenSamplers(int count, Address samplers);

    @Import(name = "glDeleteSamplers")
    public static native void glDeleteSamplers(int count, Address samplers, int offset);

    @Import(name = "glDeleteSamplers")
    public static native void glDeleteSamplers(int count, Address samplers);

    @Import(name = "glIsSampler")
    public static native boolean glIsSampler(int sampler);

    @Import(name = "glBindSampler")
    public static native void glBindSampler(int unit, int sampler);

    @Import(name = "glSamplerParameteri")
    public static native void glSamplerParameteri(int sampler, int pname, int param);

    @Import(name = "glSamplerParameteriv")
    public static native void glSamplerParameteriv(int sampler, int pname, Address param);

    @Import(name = "glSamplerParameterf")
    public static native void glSamplerParameterf(int sampler, int pname, float param);

    @Import(name = "glSamplerParameterfv")
    public static native void glSamplerParameterfv(int sampler, int pname, Address param);

    @Import(name = "glGetSamplerParameteriv")
    public static native void glGetSamplerParameteriv(int sampler, int pname, Address params);

    @Import(name = "glGetSamplerParameterfv")
    public static native void glGetSamplerParameterfv(int sampler, int pname, Address params);

    @Import(name = "glVertexAttribDivisor")
    public static native void glVertexAttribDivisor(int index, int divisor);

    @Import(name = "glBindTransformFeedback")
    public static native void glBindTransformFeedback(int target, int id);

    @Import(name = "glDeleteTransformFeedbacks")
    public static native void glDeleteTransformFeedbacks(int n, Address ids, int offset);

    @Import(name = "glDeleteTransformFeedbacks")
    public static native void glDeleteTransformFeedbacks(int n, Address ids);

    @Import(name = "glGenTransformFeedbacks")
    public static native void glGenTransformFeedbacks(int n, Address ids, int offset);

    @Import(name = "glGenTransformFeedbacks")
    public static native void glGenTransformFeedbacks(int n, Address ids);

    @Import(name = "glIsTransformFeedback")
    public static native boolean glIsTransformFeedback(int id);

    @Import(name = "glPauseTransformFeedback")
    public static native void glPauseTransformFeedback();

    @Import(name = "glResumeTransformFeedback")
    public static native void glResumeTransformFeedback();

    @Import(name = "glProgramParameteri")
    public static native void glProgramParameteri(int program, int pname, int value);

    @Import(name = "glInvalidateFramebuffer")
    public static native void glInvalidateFramebuffer(int target, int numAttachments, Address attachments);

    @Import(name = "glInvalidateSubFramebuffer")
    public static native void glInvalidateSubFramebuffer(int target, int numAttachments, Address attachments, int x, int y, int width, int height);

    @Import(name = "glActiveTexture")
    public static native void glActiveTexture(int texture);

    @Import(name = "glBindTexture")
    public static native void glBindTexture(int target, int texture);

    @Import(name = "glBlendFunc")
    public static native void glBlendFunc(int sfactor, int dfactor);

    @Import(name = "glClear")
    public static native void glClear(int mask);

    @Import(name = "glClearColor")
    public static native void glClearColor(float red, float green, float blue, float alpha);

    @Import(name = "glClearDepthf")
    public static native void glClearDepthf(float depth);

    @Import(name = "glClearStencil")
    public static native void glClearStencil(int s);

    @Import(name = "glColorMask")
    public static native void glColorMask(boolean red, boolean green, boolean blue, boolean alpha);

    @Import(name = "glCompressedTexImage2D")
    public static native void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, Address data);

    @Import(name = "glCompressedTexSubImage2D")
    public static native void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, Address data);

    @Import(name = "glCopyTexImage2D")
    public static native void glCopyTexImage2D(int target, int level, int internalformat, int x, int y, int width, int height, int border);

    @Import(name = "glCopyTexSubImage2D")
    public static native void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height);

    @Import(name = "glCullFace")
    public static native void glCullFace(int mode);

    @Import(name = "glDeleteTextures")
    public static native void glDeleteTextures(int n, Address textures);

    @Import(name = "glDeleteTexture")
    public static native void glDeleteTexture(int texture);

    @Import(name = "glDepthFunc")
    public static native void glDepthFunc(int func);

    @Import(name = "glDepthMask")
    public static native void glDepthMask(boolean flag);

    @Import(name = "glDepthRangef")
    public static native void glDepthRangef(float zNear, float zFar);

    @Import(name = "glDisable")
    public static native void glDisable(int cap);

    @Import(name = "glDrawArrays")
    public static native void glDrawArrays(int mode, int first, int count);

    @Import(name = "glDrawElements")
    public static native void glDrawElements(int mode, int count, int type, Address indices);

    @Import(name = "glEnable")
    public static native void glEnable(int cap);

    @Import(name = "glFinish")
    public static native void glFinish();

    @Import(name = "glFlush")
    public static native void glFlush();

    @Import(name = "glFrontFace")
    public static native void glFrontFace(int mode);

    @Import(name = "glGenTextures")
    public static native void glGenTextures(int n, Address textures);

    @Import(name = "glGenTexture")
    public static native int glGenTexture();

    @Import(name = "glGetError")
    public static native int glGetError();

    @Import(name = "glGetIntegerv")
    public static native void glGetIntegerv(int pname, Address params);

    @Import(name = "glGetString")
    public static native String glGetString(int name);

    @Import(name = "glHint")
    public static native void glHint(int target, int mode);

    @Import(name = "glLineWidth")
    public static native void glLineWidth(float width);

    @Import(name = "glPixelStorei")
    public static native void glPixelStorei(int pname, int param);

    @Import(name = "glPolygonOffset")
    public static native void glPolygonOffset(float factor, float units);

    @Import(name = "glReadPixels")
    public static native void glReadPixels(int x, int y, int width, int height, int format, int type, Address pixels);

    @Import(name = "glScissor")
    public static native void glScissor(int x, int y, int width, int height);

    @Import(name = "glStencilFunc")
    public static native void glStencilFunc(int func, int ref, int mask);

    @Import(name = "glStencilMask")
    public static native void glStencilMask(int mask);

    @Import(name = "glStencilOp")
    public static native void glStencilOp(int fail, int zfail, int zpass);

    @Import(name = "glTexImage2D")
    public static native void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, Address pixels);

    @Import(name = "glTexParameterf")
    public static native void glTexParameterf(int target, int pname, float param);

    @Import(name = "glTexSubImage2D")
    public static native void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, Address pixels);

    @Import(name = "glViewport")
    public static native void glViewport(int x, int y, int width, int height);

    @Import(name = "glAttachShader")
    public static native void glAttachShader(int program, int shader);

    @Import(name = "glBindAttribLocation")
    public static native void glBindAttribLocation(int program, int index, String name);

    @Import(name = "glBindBuffer")
    public static native void glBindBuffer(int target, int buffer);

    @Import(name = "glBindFramebuffer")
    public static native void glBindFramebuffer(int target, int framebuffer);

    @Import(name = "glBindRenderbuffer")
    public static native void glBindRenderbuffer(int target, int renderbuffer);

    @Import(name = "glBlendColor")
    public static native void glBlendColor(float red, float green, float blue, float alpha);

    @Import(name = "glBlendEquation")
    public static native void glBlendEquation(int mode);

    @Import(name = "glBlendEquationSeparate")
    public static native void glBlendEquationSeparate(int modeRGB, int modeAlpha);

    @Import(name = "glBlendFuncSeparate")
    public static native void glBlendFuncSeparate(int srcRGB, int dstRGB, int srcAlpha, int dstAlpha);
    @Import(name = "glBufferData")
    public static native void glBufferData(int target, int size, Address data, int usage);

    @Import(name = "glBufferSubData")
    public static native void glBufferSubData(int target, int offset, int size, Address data);

    @Import(name = "glCheckFramebufferStatus")
    public static native int glCheckFramebufferStatus(int target);

    @Import(name = "glCompileShader")
    public static native void glCompileShader(int shader);

    @Import(name = "glCreateProgram")
    public static native int glCreateProgram();

    @Import(name = "glCreateShader")
    public static native int glCreateShader(int type);

    @Import(name = "glDeleteBuffer")
    public static native void glDeleteBuffer(int buffer);

    @Import(name = "glDeleteBuffers")
    public static native void glDeleteBuffers(int n, Address buffers);

    @Import(name = "glDeleteFramebuffer")
    public static native void glDeleteFramebuffer(int framebuffer);

    @Import(name = "glDeleteFramebuffers")
    public static native void glDeleteFramebuffers(int n, Address framebuffers);

    @Import(name = "glDeleteProgram")
    public static native void glDeleteProgram(int program);

    @Import(name = "glDeleteRenderbuffer")
    public static native void glDeleteRenderbuffer(int renderbuffer);

    @Import(name = "glDeleteRenderbuffers")
    public static native void glDeleteRenderbuffers(int n, Address renderbuffers);

    @Import(name = "glDeleteShader")
    public static native void glDeleteShader(int shader);

    @Import(name = "glDetachShader")
    public static native void glDetachShader(int program, int shader);

    @Import(name = "glDisableVertexAttribArray")
    public static native void glDisableVertexAttribArray(int index);

    @Import(name = "glDrawElements")
    public static native void glDrawElements(int mode, int count, int type, int indices);

    @Import(name = "glEnableVertexAttribArray")
    public static native void glEnableVertexAttribArray(int index);

    @Import(name = "glFramebufferRenderbuffer")
    public static native void glFramebufferRenderbuffer(int target, int attachment, int renderbuffertarget, int renderbuffer);

    @Import(name = "glFramebufferTexture2D")
    public static native void glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level);

    @Import(name = "glGenBuffer")
    public static native int glGenBuffer();

    @Import(name = "glGenBuffers")
    public static native void glGenBuffers(int n, Address buffers);

    @Import(name = "glGenerateMipmap")
    public static native void glGenerateMipmap(int target);

    @Import(name = "glGenFramebuffer")
    public static native int glGenFramebuffer();

    @Import(name = "glGenFramebuffers")
    public static native void glGenFramebuffers(int n, Address framebuffers);

    @Import(name = "glGenRenderbuffer")
    public static native int glGenRenderbuffer();

    @Import(name = "glGenRenderbuffers")
    public static native void glGenRenderbuffers(int n, Address renderbuffers);

    @Import(name = "glGetActiveAttrib")
    public static native String glGetActiveAttrib(int program, int index, Address size, Address type);

    @Import(name = "glGetActiveUniform")
    public static native String glGetActiveUniform(int program, int index, Address size, Address type);

    @Import(name = "glGetAttachedShaders")
    public static native void glGetAttachedShaders(int program, int maxcount, Address count, Address shaders);

    @Import(name = "glGetAttribLocation")
    public static native int glGetAttribLocation(int program, String name);

    @Import(name = "glGetBooleanv")
    public static native void glGetBooleanv(int pname, Address params);

    @Import(name = "glGetBufferParameteriv")
    public static native void glGetBufferParameteriv(int target, int pname, Address params);

    @Import(name = "glGetFloatv")
    public static native void glGetFloatv(int pname, Address params);

    @Import(name = "glGetFramebufferAttachmentParameteriv")
    public static native void glGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, Address params);

    @Import(name = "glGetProgramiv")
    public static native void glGetProgramiv(int program, int pname, Address params);

    @Import(name = "glGetProgramInfoLog")
    public static native String glGetProgramInfoLog(int program);

    @Import(name = "glGetRenderbufferParameteriv")
    public static native void glGetRenderbufferParameteriv(int target, int pname, Address params);

    @Import(name = "glGetShaderiv")
    public static native void glGetShaderiv(int shader, int pname, Address params);

    @Import(name = "glGetShaderInfoLog")
    public static native String glGetShaderInfoLog(int shader);

    @Import(name = "glGetShaderPrecisionFormat")
    public static native void glGetShaderPrecisionFormat(int shadertype, int precisiontype, Address range, Address precision);

    @Import(name = "glGetTexParameterfv")
    public static native void glGetTexParameterfv(int target, int pname, Address params);

    @Import(name = "glGetTexParameteriv")
    public static native void glGetTexParameteriv(int target, int pname, Address params);

    @Import(name = "glGetUniformfv")
    public static native void glGetUniformfv(int program, int location, Address params);

    @Import(name = "glGetUniformiv")
    public static native void glGetUniformiv(int program, int location, Address params);

    @Import(name = "glGetUniformLocation")
    public static native int glGetUniformLocation(int program, String name);

    @Import(name = "glGetVertexAttribfv")
    public static native void glGetVertexAttribfv(int index, int pname, Address params);

    @Import(name = "glGetVertexAttribiv")
    public static native void glGetVertexAttribiv(int index, int pname, Address params);

    @Import(name = "glGetVertexAttribPointerv")
    public static native void glGetVertexAttribPointerv(int index, int pname, Address pointer);

    @Import(name = "glIsBuffer")
    public static native boolean glIsBuffer(int buffer);

    @Import(name = "glIsEnabled")
    public static native boolean glIsEnabled(int cap);

    @Import(name = "glIsFramebuffer")
    public static native boolean glIsFramebuffer(int framebuffer);

    @Import(name = "glIsProgram")
    public static native boolean glIsProgram(int program);

    @Import(name = "glIsRenderbuffer")
    public static native boolean glIsRenderbuffer(int renderbuffer);

    @Import(name = "glIsShader")
    public static native boolean glIsShader(int shader);

    @Import(name = "glIsTexture")
    public static native boolean glIsTexture(int texture);

    @Import(name = "glLinkProgram")
    public static native void glLinkProgram(int program);

    @Import(name = "glReleaseShaderCompiler")
    public static native void glReleaseShaderCompiler();

    @Import(name = "glRenderbufferStorage")
    public static native void glRenderbufferStorage(int target, int internalformat, int width, int height);

    @Import(name = "glSampleCoverage")
    public static native void glSampleCoverage(float value, boolean invert);

    @Import(name = "glShaderBinary")
    public static native void glShaderBinary(int n, Address shaders, int binaryformat, Address binary, int length);

    @Import(name = "glShaderSource")
    public static native void glShaderSource(int shader, String string);

    @Import(name = "glStencilFuncSeparate")
    public static native void glStencilFuncSeparate(int face, int func, int ref, int mask);

    @Import(name = "glStencilMaskSeparate")
    public static native void glStencilMaskSeparate(int face, int mask);

    @Import(name = "glStencilOpSeparate")
    public static native void glStencilOpSeparate(int face, int fail, int zfail, int zpass);

    @Import(name = "glTexParameterfv")
    public static native void glTexParameterfv(int target, int pname, Address params);

    @Import(name = "glTexParameteri")
    public static native void glTexParameteri(int target, int pname, int param);

    @Import(name = "glTexParameteriv")
    public static native void glTexParameteriv(int target, int pname, Address params);

    @Import(name = "glUniform1f")
    public static native void glUniform1f(int location, float x);

    @Import(name = "glUniform1fv")
    public static native void glUniform1fv(int location, int count, Address v);

    @Import(name = "glUniform1fv")
    public static native void glUniform1fv(int location, int count, Address v, int offset);

    @Import(name = "glUniform1i")
    public static native void glUniform1i(int location, int x);

    @Import(name = "glUniform1iv")
    public static native void glUniform1iv(int location, int count, Address v);

    @Import(name = "glUniform1iv")
    public static native void glUniform1iv(int location, int count, Address v, int offset);

    @Import(name = "glUniform2f")
    public static native void glUniform2f(int location, float x, float y);

    @Import(name = "glUniform2fv")
    public static native void glUniform2fv(int location, int count, Address v);

    @Import(name = "glUniform2fv")
    public static native void glUniform2fv(int location, int count, Address v, int offset);

    @Import(name = "glUniform2i")
    public static native void glUniform2i(int location, int x, int y);

    @Import(name = "glUniform2iv")
    public static native void glUniform2iv(int location, int count, Address v);

    @Import(name = "glUniform2iv")
    public static native void glUniform2iv(int location, int count, Address v, int offset);

    @Import(name = "glUniform3f")
    public static native void glUniform3f(int location, float x, float y, float z);

    @Import(name = "glUniform3fv")
    public static native void glUniform3fv(int location, int count, Address v);

    @Import(name = "glUniform3fv")
    public static native void glUniform3fv(int location, int count, Address v, int offset);

    @Import(name = "glUniform3i")
    public static native void glUniform3i(int location, int x, int y, int z);

    @Import(name = "glUniform3iv")
    public static native void glUniform3iv(int location, int count, Address v);

    @Import(name = "glUniform3iv")
    public static native void glUniform3iv(int location, int count, Address v, int offset);

    @Import(name = "glUniform4f")
    public static native void glUniform4f(int location, float x, float y, float z, float w);

    @Import(name = "glUniform4fv")
    public static native void glUniform4fv(int location, int count, Address v);

    @Import(name = "glUniform4fv")
    public static native void glUniform4fv(int location, int count, Address v, int offset);

    @Import(name = "glUniform4i")
    public static native void glUniform4i(int location, int x, int y, int z, int w);

    @Import(name = "glUniform4iv")
    public static native void glUniform4iv(int location, int count, Address v);

    @Import(name = "glUniform4iv")
    public static native void glUniform4iv(int location, int count, Address v, int offset);

    @Import(name = "glUniformMatrix2fv")
    public static native void glUniformMatrix2fv(int location, int count, boolean transpose, Address value);

    @Import(name = "glUniformMatrix2fv")
    public static native void glUniformMatrix2fv(int location, int count, boolean transpose, Address value, int offset);

    @Import(name = "glUniformMatrix3fv")
    public static native void glUniformMatrix3fv(int location, int count, boolean transpose, Address value);

    @Import(name = "glUniformMatrix3fv")
    public static native void glUniformMatrix3fv(int location, int count, boolean transpose, Address value, int offset);

    @Import(name = "glUniformMatrix4fv")
    public static native void glUniformMatrix4fv(int location, int count, boolean transpose, Address value);

    @Import(name = "glUniformMatrix4fv")
    public static native void glUniformMatrix4fv(int location, int count, boolean transpose, Address value, int offset);

    @Import(name = "glUseProgram")
    public static native void glUseProgram(int program);

    @Import(name = "glValidateProgram")
    public static native void glValidateProgram(int program);

    @Import(name = "glVertexAttrib1f")
    public static native void glVertexAttrib1f(int indx, float x);

    @Import(name = "glVertexAttrib1fv")
    public static native void glVertexAttrib1fv(int indx, Address values);

    @Import(name = "glVertexAttrib2f")
    public static native void glVertexAttrib2f(int indx, float x, float y);

    @Import(name = "glVertexAttrib2fv")
    public static native void glVertexAttrib2fv(int indx, Address values);

    @Import(name = "glVertexAttrib3f")
    public static native void glVertexAttrib3f(int indx, float x, float y, float z);

    @Import(name = "glVertexAttrib3fv")
    public static native void glVertexAttrib3fv(int indx, Address values);

    @Import(name = "glVertexAttrib4f")
    public static native void glVertexAttrib4f(int indx, float x, float y, float z, float w);

    @Import(name = "glVertexAttrib4fv")
    public static native void glVertexAttrib4fv(int indx, Address values);

    @Import(name = "glVertexAttribPointer")
    public static native void glVertexAttribPointer(int indx, int size, int type, boolean normalized, int stride, Address ptr);

    @Import(name = "glVertexAttribPointer")
    public static native void glVertexAttribPointer(int indx, int size, int type, boolean normalized, int stride, int ptr);
}