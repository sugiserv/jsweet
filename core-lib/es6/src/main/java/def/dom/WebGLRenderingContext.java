package def.dom;

import def.js.ArrayBufferView;
import def.js.Int32Array;
import def.js.Object;

public class WebGLRenderingContext extends def.js.Object {
    public HTMLCanvasElement canvas;
    public double drawingBufferHeight;
    public double drawingBufferWidth;
    native public void activeTexture(double texture);
    native public void attachShader(WebGLProgram program, WebGLShader shader);
    native public void bindAttribLocation(WebGLProgram program, double index, java.lang.String name);
    native public void bindBuffer(double target, WebGLBuffer buffer);
    native public void bindFramebuffer(double target, WebGLFramebuffer framebuffer);
    native public void bindRenderbuffer(double target, WebGLRenderbuffer renderbuffer);
    native public void bindTexture(double target, WebGLTexture texture);
    native public void blendColor(double red, double green, double blue, double alpha);
    native public void blendEquation(double mode);
    native public void blendEquationSeparate(double modeRGB, double modeAlpha);
    native public void blendFunc(double sfactor, double dfactor);
    native public void blendFuncSeparate(double srcRGB, double dstRGB, double srcAlpha, double dstAlpha);
    native public void bufferData(double target, double size, double usage);
    native public void bufferData(double target, ArrayBufferView size, double usage);
    native public void bufferData(double target, java.lang.Object size, double usage);
    native public void bufferSubData(double target, double offset, ArrayBufferView data);
    native public void bufferSubData(double target, double offset, java.lang.Object data);
    native public double checkFramebufferStatus(double target);
    native public void clear(double mask);
    native public void clearColor(double red, double green, double blue, double alpha);
    native public void clearDepth(double depth);
    native public void clearStencil(double s);
    native public void colorMask(java.lang.Boolean red, java.lang.Boolean green, java.lang.Boolean blue, java.lang.Boolean alpha);
    native public void compileShader(WebGLShader shader);
    native public void compressedTexImage2D(double target, double level, double internalformat, double width, double height, double border, ArrayBufferView data);
    native public void compressedTexSubImage2D(double target, double level, double xoffset, double yoffset, double width, double height, double format, ArrayBufferView data);
    native public void copyTexImage2D(double target, double level, double internalformat, double x, double y, double width, double height, double border);
    native public void copyTexSubImage2D(double target, double level, double xoffset, double yoffset, double x, double y, double width, double height);
    native public WebGLBuffer createBuffer();
    native public WebGLFramebuffer createFramebuffer();
    native public WebGLProgram createProgram();
    native public WebGLRenderbuffer createRenderbuffer();
    native public WebGLShader createShader(double type);
    native public WebGLTexture createTexture();
    native public void cullFace(double mode);
    native public void deleteBuffer(WebGLBuffer buffer);
    native public void deleteFramebuffer(WebGLFramebuffer framebuffer);
    native public void deleteProgram(WebGLProgram program);
    native public void deleteRenderbuffer(WebGLRenderbuffer renderbuffer);
    native public void deleteShader(WebGLShader shader);
    native public void deleteTexture(WebGLTexture texture);
    native public void depthFunc(double func);
    native public void depthMask(java.lang.Boolean flag);
    native public void depthRange(double zNear, double zFar);
    native public void detachShader(WebGLProgram program, WebGLShader shader);
    native public void disable(double cap);
    native public void disableVertexAttribArray(double index);
    native public void drawArrays(double mode, double first, double count);
    native public void drawElements(double mode, double count, double type, double offset);
    native public void enable(double cap);
    native public void enableVertexAttribArray(double index);
    native public void finish();
    native public void flush();
    native public void framebufferRenderbuffer(double target, double attachment, double renderbuffertarget, WebGLRenderbuffer renderbuffer);
    native public void framebufferTexture2D(double target, double attachment, double textarget, WebGLTexture texture, double level);
    native public void frontFace(double mode);
    native public void generateMipmap(double target);
    native public WebGLActiveInfo getActiveAttrib(WebGLProgram program, double index);
    native public WebGLActiveInfo getActiveUniform(WebGLProgram program, double index);
    native public WebGLShader[] getAttachedShaders(WebGLProgram program);
    native public double getAttribLocation(WebGLProgram program, java.lang.String name);
    native public java.lang.Object getBufferParameter(double target, double pname);
    native public WebGLContextAttributes getContextAttributes();
    native public double getError();
    native public java.lang.Object getExtension(java.lang.String name);
    native public java.lang.Object getFramebufferAttachmentParameter(double target, double attachment, double pname);
    native public java.lang.Object getParameter(double pname);
    native public java.lang.String getProgramInfoLog(WebGLProgram program);
    native public java.lang.Object getProgramParameter(WebGLProgram program, double pname);
    native public java.lang.Object getRenderbufferParameter(double target, double pname);
    native public java.lang.String getShaderInfoLog(WebGLShader shader);
    native public java.lang.Object getShaderParameter(WebGLShader shader, double pname);
    native public WebGLShaderPrecisionFormat getShaderPrecisionFormat(double shadertype, double precisiontype);
    native public java.lang.String getShaderSource(WebGLShader shader);
    native public java.lang.String[] getSupportedExtensions();
    native public java.lang.Object getTexParameter(double target, double pname);
    native public java.lang.Object getUniform(WebGLProgram program, WebGLUniformLocation location);
    native public WebGLUniformLocation getUniformLocation(WebGLProgram program, java.lang.String name);
    native public java.lang.Object getVertexAttrib(double index, double pname);
    native public double getVertexAttribOffset(double index, double pname);
    native public void hint(double target, double mode);
    native public java.lang.Boolean isBuffer(WebGLBuffer buffer);
    native public java.lang.Boolean isContextLost();
    native public java.lang.Boolean isEnabled(double cap);
    native public java.lang.Boolean isFramebuffer(WebGLFramebuffer framebuffer);
    native public java.lang.Boolean isProgram(WebGLProgram program);
    native public java.lang.Boolean isRenderbuffer(WebGLRenderbuffer renderbuffer);
    native public java.lang.Boolean isShader(WebGLShader shader);
    native public java.lang.Boolean isTexture(WebGLTexture texture);
    native public void lineWidth(double width);
    native public void linkProgram(WebGLProgram program);
    native public void pixelStorei(double pname, double param);
    native public void polygonOffset(double factor, double units);
    native public void readPixels(double x, double y, double width, double height, double format, double type, ArrayBufferView pixels);
    native public void renderbufferStorage(double target, double internalformat, double width, double height);
    native public void sampleCoverage(double value, java.lang.Boolean invert);
    native public void scissor(double x, double y, double width, double height);
    native public void shaderSource(WebGLShader shader, java.lang.String source);
    native public void stencilFunc(double func, double ref, double mask);
    native public void stencilFuncSeparate(double face, double func, double ref, double mask);
    native public void stencilMask(double mask);
    native public void stencilMaskSeparate(double face, double mask);
    native public void stencilOp(double fail, double zfail, double zpass);
    native public void stencilOpSeparate(double face, double fail, double zfail, double zpass);
    native public void texImage2D(double target, double level, double internalformat, double width, double height, double border, double format, double type, ArrayBufferView pixels);
    native public void texImage2D(double target, double level, double internalformat, double format, double type, HTMLImageElement image);
    native public void texImage2D(double target, double level, double internalformat, double format, double type, HTMLCanvasElement canvas);
    native public void texImage2D(double target, double level, double internalformat, double format, double type, HTMLVideoElement video);
    native public void texImage2D(double target, double level, double internalformat, double format, double type, ImageData pixels);
    native public void texParameterf(double target, double pname, double param);
    native public void texParameteri(double target, double pname, double param);
    native public void texSubImage2D(double target, double level, double xoffset, double yoffset, double width, double height, double format, double type, ArrayBufferView pixels);
    native public void texSubImage2D(double target, double level, double xoffset, double yoffset, double format, double type, HTMLImageElement image);
    native public void texSubImage2D(double target, double level, double xoffset, double yoffset, double format, double type, HTMLCanvasElement canvas);
    native public void texSubImage2D(double target, double level, double xoffset, double yoffset, double format, double type, HTMLVideoElement video);
    native public void texSubImage2D(double target, double level, double xoffset, double yoffset, double format, double type, ImageData pixels);
    native public void uniform1f(WebGLUniformLocation location, double x);
    native public void uniform1fv(WebGLUniformLocation location, java.lang.Object v);
    native public void uniform1i(WebGLUniformLocation location, double x);
    native public void uniform1iv(WebGLUniformLocation location, Int32Array v);
    native public void uniform2f(WebGLUniformLocation location, double x, double y);
    native public void uniform2fv(WebGLUniformLocation location, java.lang.Object v);
    native public void uniform2i(WebGLUniformLocation location, double x, double y);
    native public void uniform2iv(WebGLUniformLocation location, Int32Array v);
    native public void uniform3f(WebGLUniformLocation location, double x, double y, double z);
    native public void uniform3fv(WebGLUniformLocation location, java.lang.Object v);
    native public void uniform3i(WebGLUniformLocation location, double x, double y, double z);
    native public void uniform3iv(WebGLUniformLocation location, Int32Array v);
    native public void uniform4f(WebGLUniformLocation location, double x, double y, double z, double w);
    native public void uniform4fv(WebGLUniformLocation location, java.lang.Object v);
    native public void uniform4i(WebGLUniformLocation location, double x, double y, double z, double w);
    native public void uniform4iv(WebGLUniformLocation location, Int32Array v);
    native public void uniformMatrix2fv(WebGLUniformLocation location, java.lang.Boolean transpose, java.lang.Object value);
    native public void uniformMatrix3fv(WebGLUniformLocation location, java.lang.Boolean transpose, java.lang.Object value);
    native public void uniformMatrix4fv(WebGLUniformLocation location, java.lang.Boolean transpose, java.lang.Object value);
    native public void useProgram(WebGLProgram program);
    native public void validateProgram(WebGLProgram program);
    native public void vertexAttrib1f(double indx, double x);
    native public void vertexAttrib1fv(double indx, java.lang.Object values);
    native public void vertexAttrib2f(double indx, double x, double y);
    native public void vertexAttrib2fv(double indx, java.lang.Object values);
    native public void vertexAttrib3f(double indx, double x, double y, double z);
    native public void vertexAttrib3fv(double indx, java.lang.Object values);
    native public void vertexAttrib4f(double indx, double x, double y, double z, double w);
    native public void vertexAttrib4fv(double indx, java.lang.Object values);
    native public void vertexAttribPointer(double indx, double size, double type, java.lang.Boolean normalized, double stride, double offset);
    native public void viewport(double x, double y, double width, double height);
    public double ACTIVE_ATTRIBUTES;
    public double ACTIVE_TEXTURE;
    public double ACTIVE_UNIFORMS;
    public double ALIASED_LINE_WIDTH_RANGE;
    public double ALIASED_POINT_SIZE_RANGE;
    public double ALPHA;
    public double ALPHA_BITS;
    public double ALWAYS;
    public double ARRAY_BUFFER;
    public double ARRAY_BUFFER_BINDING;
    public double ATTACHED_SHADERS;
    public double BACK;
    public double BLEND;
    public double BLEND_COLOR;
    public double BLEND_DST_ALPHA;
    public double BLEND_DST_RGB;
    public double BLEND_EQUATION;
    public double BLEND_EQUATION_ALPHA;
    public double BLEND_EQUATION_RGB;
    public double BLEND_SRC_ALPHA;
    public double BLEND_SRC_RGB;
    public double BLUE_BITS;
    public double BOOL;
    public double BOOL_VEC2;
    public double BOOL_VEC3;
    public double BOOL_VEC4;
    public double BROWSER_DEFAULT_WEBGL;
    public double BUFFER_SIZE;
    public double BUFFER_USAGE;
    public double BYTE;
    public double CCW;
    public double CLAMP_TO_EDGE;
    public double COLOR_ATTACHMENT0;
    public double COLOR_BUFFER_BIT;
    public double COLOR_CLEAR_VALUE;
    public double COLOR_WRITEMASK;
    public double COMPILE_STATUS;
    public double COMPRESSED_TEXTURE_FORMATS;
    public double CONSTANT_ALPHA;
    public double CONSTANT_COLOR;
    public double CONTEXT_LOST_WEBGL;
    public double CULL_FACE;
    public double CULL_FACE_MODE;
    public double CURRENT_PROGRAM;
    public double CURRENT_VERTEX_ATTRIB;
    public double CW;
    public double DECR;
    public double DECR_WRAP;
    public double DELETE_STATUS;
    public double DEPTH_ATTACHMENT;
    public double DEPTH_BITS;
    public double DEPTH_BUFFER_BIT;
    public double DEPTH_CLEAR_VALUE;
    public double DEPTH_COMPONENT;
    public double DEPTH_COMPONENT16;
    public double DEPTH_FUNC;
    public double DEPTH_RANGE;
    public double DEPTH_STENCIL;
    public double DEPTH_STENCIL_ATTACHMENT;
    public double DEPTH_TEST;
    public double DEPTH_WRITEMASK;
    public double DITHER;
    public double DONT_CARE;
    public double DST_ALPHA;
    public double DST_COLOR;
    public double DYNAMIC_DRAW;
    public double ELEMENT_ARRAY_BUFFER;
    public double ELEMENT_ARRAY_BUFFER_BINDING;
    public double EQUAL;
    public double FASTEST;
    public double FLOAT;
    public double FLOAT_MAT2;
    public double FLOAT_MAT3;
    public double FLOAT_MAT4;
    public double FLOAT_VEC2;
    public double FLOAT_VEC3;
    public double FLOAT_VEC4;
    public double FRAGMENT_SHADER;
    public double FRAMEBUFFER;
    public double FRAMEBUFFER_ATTACHMENT_OBJECT_NAME;
    public double FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE;
    public double FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE;
    public double FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL;
    public double FRAMEBUFFER_BINDING;
    public double FRAMEBUFFER_COMPLETE;
    public double FRAMEBUFFER_INCOMPLETE_ATTACHMENT;
    public double FRAMEBUFFER_INCOMPLETE_DIMENSIONS;
    public double FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT;
    public double FRAMEBUFFER_UNSUPPORTED;
    public double FRONT;
    public double FRONT_AND_BACK;
    public double FRONT_FACE;
    public double FUNC_ADD;
    public double FUNC_REVERSE_SUBTRACT;
    public double FUNC_SUBTRACT;
    public double GENERATE_MIPMAP_HINT;
    public double GEQUAL;
    public double GREATER;
    public double GREEN_BITS;
    public double HIGH_FLOAT;
    public double HIGH_INT;
    public double IMPLEMENTATION_COLOR_READ_FORMAT;
    public double IMPLEMENTATION_COLOR_READ_TYPE;
    public double INCR;
    public double INCR_WRAP;
    public double INT;
    public double INT_VEC2;
    public double INT_VEC3;
    public double INT_VEC4;
    public double INVALID_ENUM;
    public double INVALID_FRAMEBUFFER_OPERATION;
    public double INVALID_OPERATION;
    public double INVALID_VALUE;
    public double INVERT;
    public double KEEP;
    public double LEQUAL;
    public double LESS;
    public double LINEAR;
    public double LINEAR_MIPMAP_LINEAR;
    public double LINEAR_MIPMAP_NEAREST;
    public double LINES;
    public double LINE_LOOP;
    public double LINE_STRIP;
    public double LINE_WIDTH;
    public double LINK_STATUS;
    public double LOW_FLOAT;
    public double LOW_INT;
    public double LUMINANCE;
    public double LUMINANCE_ALPHA;
    public double MAX_COMBINED_TEXTURE_IMAGE_UNITS;
    public double MAX_CUBE_MAP_TEXTURE_SIZE;
    public double MAX_FRAGMENT_UNIFORM_VECTORS;
    public double MAX_RENDERBUFFER_SIZE;
    public double MAX_TEXTURE_IMAGE_UNITS;
    public double MAX_TEXTURE_SIZE;
    public double MAX_VARYING_VECTORS;
    public double MAX_VERTEX_ATTRIBS;
    public double MAX_VERTEX_TEXTURE_IMAGE_UNITS;
    public double MAX_VERTEX_UNIFORM_VECTORS;
    public double MAX_VIEWPORT_DIMS;
    public double MEDIUM_FLOAT;
    public double MEDIUM_INT;
    public double MIRRORED_REPEAT;
    public double NEAREST;
    public double NEAREST_MIPMAP_LINEAR;
    public double NEAREST_MIPMAP_NEAREST;
    public double NEVER;
    public double NICEST;
    public double NONE;
    public double NOTEQUAL;
    public double NO_ERROR;
    public double ONE;
    public double ONE_MINUS_CONSTANT_ALPHA;
    public double ONE_MINUS_CONSTANT_COLOR;
    public double ONE_MINUS_DST_ALPHA;
    public double ONE_MINUS_DST_COLOR;
    public double ONE_MINUS_SRC_ALPHA;
    public double ONE_MINUS_SRC_COLOR;
    public double OUT_OF_MEMORY;
    public double PACK_ALIGNMENT;
    public double POINTS;
    public double POLYGON_OFFSET_FACTOR;
    public double POLYGON_OFFSET_FILL;
    public double POLYGON_OFFSET_UNITS;
    public double RED_BITS;
    public double RENDERBUFFER;
    public double RENDERBUFFER_ALPHA_SIZE;
    public double RENDERBUFFER_BINDING;
    public double RENDERBUFFER_BLUE_SIZE;
    public double RENDERBUFFER_DEPTH_SIZE;
    public double RENDERBUFFER_GREEN_SIZE;
    public double RENDERBUFFER_HEIGHT;
    public double RENDERBUFFER_INTERNAL_FORMAT;
    public double RENDERBUFFER_RED_SIZE;
    public double RENDERBUFFER_STENCIL_SIZE;
    public double RENDERBUFFER_WIDTH;
    public double RENDERER;
    public double REPEAT;
    public double REPLACE;
    public double RGB;
    public double RGB565;
    public double RGB5_A1;
    public double RGBA;
    public double RGBA4;
    public double SAMPLER_2D;
    public double SAMPLER_CUBE;
    public double SAMPLES;
    public double SAMPLE_ALPHA_TO_COVERAGE;
    public double SAMPLE_BUFFERS;
    public double SAMPLE_COVERAGE;
    public double SAMPLE_COVERAGE_INVERT;
    public double SAMPLE_COVERAGE_VALUE;
    public double SCISSOR_BOX;
    public double SCISSOR_TEST;
    public double SHADER_TYPE;
    public double SHADING_LANGUAGE_VERSION;
    public double SHORT;
    public double SRC_ALPHA;
    public double SRC_ALPHA_SATURATE;
    public double SRC_COLOR;
    public double STATIC_DRAW;
    public double STENCIL_ATTACHMENT;
    public double STENCIL_BACK_FAIL;
    public double STENCIL_BACK_FUNC;
    public double STENCIL_BACK_PASS_DEPTH_FAIL;
    public double STENCIL_BACK_PASS_DEPTH_PASS;
    public double STENCIL_BACK_REF;
    public double STENCIL_BACK_VALUE_MASK;
    public double STENCIL_BACK_WRITEMASK;
    public double STENCIL_BITS;
    public double STENCIL_BUFFER_BIT;
    public double STENCIL_CLEAR_VALUE;
    public double STENCIL_FAIL;
    public double STENCIL_FUNC;
    public double STENCIL_INDEX;
    public double STENCIL_INDEX8;
    public double STENCIL_PASS_DEPTH_FAIL;
    public double STENCIL_PASS_DEPTH_PASS;
    public double STENCIL_REF;
    public double STENCIL_TEST;
    public double STENCIL_VALUE_MASK;
    public double STENCIL_WRITEMASK;
    public double STREAM_DRAW;
    public double SUBPIXEL_BITS;
    public double TEXTURE;
    public double TEXTURE0;
    public double TEXTURE1;
    public double TEXTURE10;
    public double TEXTURE11;
    public double TEXTURE12;
    public double TEXTURE13;
    public double TEXTURE14;
    public double TEXTURE15;
    public double TEXTURE16;
    public double TEXTURE17;
    public double TEXTURE18;
    public double TEXTURE19;
    public double TEXTURE2;
    public double TEXTURE20;
    public double TEXTURE21;
    public double TEXTURE22;
    public double TEXTURE23;
    public double TEXTURE24;
    public double TEXTURE25;
    public double TEXTURE26;
    public double TEXTURE27;
    public double TEXTURE28;
    public double TEXTURE29;
    public double TEXTURE3;
    public double TEXTURE30;
    public double TEXTURE31;
    public double TEXTURE4;
    public double TEXTURE5;
    public double TEXTURE6;
    public double TEXTURE7;
    public double TEXTURE8;
    public double TEXTURE9;
    public double TEXTURE_2D;
    public double TEXTURE_BINDING_2D;
    public double TEXTURE_BINDING_CUBE_MAP;
    public double TEXTURE_CUBE_MAP;
    public double TEXTURE_CUBE_MAP_NEGATIVE_X;
    public double TEXTURE_CUBE_MAP_NEGATIVE_Y;
    public double TEXTURE_CUBE_MAP_NEGATIVE_Z;
    public double TEXTURE_CUBE_MAP_POSITIVE_X;
    public double TEXTURE_CUBE_MAP_POSITIVE_Y;
    public double TEXTURE_CUBE_MAP_POSITIVE_Z;
    public double TEXTURE_MAG_FILTER;
    public double TEXTURE_MIN_FILTER;
    public double TEXTURE_WRAP_S;
    public double TEXTURE_WRAP_T;
    public double TRIANGLES;
    public double TRIANGLE_FAN;
    public double TRIANGLE_STRIP;
    public double UNPACK_ALIGNMENT;
    public double UNPACK_COLORSPACE_CONVERSION_WEBGL;
    public double UNPACK_FLIP_Y_WEBGL;
    public double UNPACK_PREMULTIPLY_ALPHA_WEBGL;
    public double UNSIGNED_BYTE;
    public double UNSIGNED_INT;
    public double UNSIGNED_SHORT;
    public double UNSIGNED_SHORT_4_4_4_4;
    public double UNSIGNED_SHORT_5_5_5_1;
    public double UNSIGNED_SHORT_5_6_5;
    public double VALIDATE_STATUS;
    public double VENDOR;
    public double VERSION;
    public double VERTEX_ATTRIB_ARRAY_BUFFER_BINDING;
    public double VERTEX_ATTRIB_ARRAY_ENABLED;
    public double VERTEX_ATTRIB_ARRAY_NORMALIZED;
    public double VERTEX_ATTRIB_ARRAY_POINTER;
    public double VERTEX_ATTRIB_ARRAY_SIZE;
    public double VERTEX_ATTRIB_ARRAY_STRIDE;
    public double VERTEX_ATTRIB_ARRAY_TYPE;
    public double VERTEX_SHADER;
    public double VIEWPORT;
    public double ZERO;
    public static WebGLRenderingContext prototype;
    public WebGLRenderingContext(){}
}

